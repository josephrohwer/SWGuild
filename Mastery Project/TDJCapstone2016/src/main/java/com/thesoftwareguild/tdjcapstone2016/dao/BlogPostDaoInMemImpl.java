package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.Contact;
import com.thesoftwareguild.tdjcapstone2016.dto.Post;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BlogPostDaoInMemImpl implements BlogPostDao {

    private int postIdCounter = 0;
    private Map<Integer, Post> postMap = new HashMap<>();

    @Override
    public Post addPost(Post post) {
        post.setPostId(postIdCounter);
        postIdCounter++;
        post.setPostDate();
        postMap.put(post.getPostId(), post);
        return post;
    }

    @Override
    public void removePost(int postId) {
        postMap.remove(postId);
    }

    @Override
    public void updatePost(Post post) {
        postMap.put(post.getPostId(), post);
    }

    @Override
    public void approvePost(int id) {
        postMap.get(id).setStatus(true);
    }

    @Override
    public List<Post> getAllPosts() {
        List<Post> pl = postMap.values()
                .stream()
                .collect(Collectors.toList());
        return pl;
    }

    @Override
    public List<Post> getQueuedPosts() {
        List<Post> qp = postMap.values()
                .stream()
                .filter(p -> false == p.getStatus())
                .filter(p -> LocalDate.now().isBefore(p.getExpDate()))
                .collect(Collectors.toList());
        return qp;
    }

    @Override
    public List<Post> getApprovedPosts() {
        List<Post> ap = postMap.values()
                .stream()
                .filter(p -> true == p.getStatus())
                .filter(p -> LocalDate.now().isBefore(p.getExpDate()))
                .collect(Collectors.toList());
        return ap;
    }

    @Override
    public List<Post> getRecentPosts() {
        List<Post> rp = postMap.values()
                .stream()
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
        return postMap.get(postId);
    }

    @Override
    public List<Post> searchPosts(Map<SearchTerm, String> criteria) {
        String titleCriteria = criteria.get(SearchTerm.TITLE);
        String tagCriteria = criteria.get(SearchTerm.TAGS);

        Predicate<Post> titleMatches;
        Predicate<Post> tagMatches;

        Predicate<Post> truePredicate = (c) -> {
            return true;
        };

        titleMatches = (titleCriteria == null || titleCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getTitle().equals(titleCriteria);

        tagMatches = (tagCriteria == null || tagCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getTags().contains(tagCriteria);

        return postMap.values()
                .stream()
                .filter(titleMatches
                        .and(tagMatches))
                .collect(Collectors.toList());

    }
}
