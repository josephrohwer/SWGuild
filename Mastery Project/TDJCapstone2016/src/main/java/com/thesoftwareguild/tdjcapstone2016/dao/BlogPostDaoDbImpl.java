package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.Post;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class BlogPostDaoDbImpl implements BlogPostDao {

    private static final String SQL_INSERT_POST
            = "insert into posts (title, postBody, postDate, expDate, `status`) values (?, ?, ?, ?, ?)";
    private static final String SQL_INSERT_TAGS
            = "insert into tags (tag, post_id) values (?,?)";
    private static final String SQL_DELETE_POST
            = "delete from posts where post_id = ?";
    private static final String SQL_CLEAR_POST_TAGS
            = "delete from tags where post_id = ?";
    private static final String SQL_SELECT_POST
            = "select * from posts where post_id = ?";
    private static final String SQL_UPDATE_POST
            = "update posts set title = ?, postBody = ?, postDate = ?, expDate = ?, `status` = ? where post_id = ?";
    private static final String SQL_SELECT_ALL_POSTS
            = "select * from posts order by postDate desc";
    private static final String SQL_SELECT_TAGS
            = "select tag from tags where post_id = ?";
    private static final String SQL_SEARCH_POSTS
            = "Select distinct posts.post_id, title, postBody, postDate, expDate, `status` "
            + "from posts join tags on (posts.post_id = tags.post_id AND tag like ?) "
            + "where title like ? "
            + "AND postDate like ? "
            + "AND expDate > now() "
            + "AND `status` like 1 "
            + "order by postDate desc";
    private static final String SQL_SEARCH_POSTS_NO_TAG
            = "Select * from posts where title like ?"
            + "AND postDate like ?"
            + "AND expDate > now()"
            + "AND `status` like 1 "
            + "order by postDate desc";

    private JdbcTemplate jdbcTemplate;
    private List<Post> memList;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Post addPost(Post post) {
        post.setPostDate();
        Date pd = Date.valueOf(post.getPostDate());
        Date exd = Date.valueOf(post.getExpDate());
        jdbcTemplate.update(SQL_INSERT_POST,
                post.getTitle(),
                post.getPostBody(),
                pd,
                exd,
                post.getStatus());
        post.setPostId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()",
                Integer.class));
        return post;
    }

    @Override
    public void removePost(int postId) {
        jdbcTemplate.update(SQL_DELETE_POST, postId);
    }

    @Override
    public void updatePost(Post post) {
        LocalDate l = LocalDate.parse(post.getPostDateString());
        Date pd = Date.valueOf(l);
        Date exd = Date.valueOf(post.getExpDate());
        jdbcTemplate.update(SQL_UPDATE_POST,
                post.getTitle(),
                post.getPostBody(),
                pd,
                exd,
                post.getStatus(),
                post.getPostId());
        jdbcTemplate.update(SQL_CLEAR_POST_TAGS, post.getPostId());
        for (String t : post.getTags()) {
            jdbcTemplate.update(SQL_INSERT_TAGS, t, post.getPostId());
        }
    }

    @Override
    public void approvePost(int id) {
        Post post = getPostById(id);
        post.setStatus(true);
        updatePost(post);
    }

    @Override
    public List<Post> getAllPosts() {
        List<Post> l = jdbcTemplate.query(SQL_SELECT_ALL_POSTS, new PostMapper());
        memList = l;
        return l;
    }

    @Override
    public List<Post> getQueuedPosts() {
        List<Post> l = jdbcTemplate.query(SQL_SELECT_ALL_POSTS, new PostMapper());
        List<Post> li = l.stream()
                .filter(p -> false == p.getStatus())
                .filter(p -> LocalDate.now().isBefore(p.getExpDate()))
                .collect(Collectors.toList());
        return li;
    }

    @Override
    public List<Post> getApprovedPosts() {
        List<Post> l = jdbcTemplate.query(SQL_SELECT_ALL_POSTS, new PostMapper());
        List<Post> li = l.stream()
                .filter(p -> true == p.getStatus())
                .filter(p -> LocalDate.now().isBefore(p.getExpDate()))
                .collect(Collectors.toList());
        return li;
    }

    @Override
    public List<Post> getRecentPosts() {
        List<Post> l = jdbcTemplate.query(SQL_SELECT_ALL_POSTS, new PostMapper());
        List<Post> rp = l.stream()
                .filter(p -> p.getPostDate()
                        .isAfter(LocalDate.now()
                                .minusDays(30)))
                .filter(p -> true == p.getStatus())
                .filter(p -> LocalDate.now().isBefore(p.getExpDate()))
                .collect(Collectors.toList());
        return rp;
    }

    @Override
    public Post getPostById(int postId) {
        try {
            Post p = jdbcTemplate.queryForObject(SQL_SELECT_POST,
                    new PostMapper(), postId);
            p.setTags(jdbcTemplate.query(SQL_SELECT_TAGS, new TagsMapper(), postId));
            return p;
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    private static final class PostMapper implements RowMapper<Post> {

        @Override
        public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
            Post post = new Post();
            post.setPostId(rs.getInt("post_id"));
            post.setTitle(rs.getString("title"));
            post.setPostBody(rs.getString("postBody"));
            post.setPostDateJSON(rs.getDate("postDate").toLocalDate().toString());
            post.setPostDateString(rs.getDate("postDate").toLocalDate());
            post.setExpDate((rs.getDate("expDate").toLocalDate()));
            post.setExpDateString(rs.getDate("expDate").toLocalDate());
            if (rs.getInt("status") == 1) {
                post.setStatus(true);
            } else {
                post.setStatus(false);
            }
            return post;
        }
    }

    private static final class TagsMapper implements RowMapper<String> {

        @Override
        public String mapRow(ResultSet rs, int rowNum) throws SQLException {
            String tag = (rs.getString("tag"));
            return tag;
        }
    }

    @Override
    public List<Post> searchPosts(Map<SearchTerm, String> criteria) {
        //check if tags null, if null, 2 param search, if not 3 param search...
               
            if(criteria.get(SearchTerm.TAGS) == null){

                return jdbcTemplate.query(SQL_SEARCH_POSTS_NO_TAG, new PostMapper(),
                        criteria.get(SearchTerm.TITLE) == null ? "%" : "%" + criteria.get(SearchTerm.TITLE) + "%",
                        criteria.get(SearchTerm.DATE) == null ? "%" : "%" + criteria.get(SearchTerm.DATE) + "%");
            }
            else{   return jdbcTemplate.query(SQL_SEARCH_POSTS, new PostMapper(),
                        criteria.get(SearchTerm.TAGS) == null ? "%" : "%" + criteria.get(SearchTerm.TAGS) + "%",
                        criteria.get(SearchTerm.TITLE) == null ? "%" : "%" + criteria.get(SearchTerm.TITLE) + "%",
                        criteria.get(SearchTerm.DATE) == null ? "%" : "%" + criteria.get(SearchTerm.DATE) + "%");
            }
             
        }
    }
           
