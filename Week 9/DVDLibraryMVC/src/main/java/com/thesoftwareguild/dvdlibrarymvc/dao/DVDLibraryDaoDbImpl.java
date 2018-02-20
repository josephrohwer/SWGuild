/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.dao;

import com.thesoftwareguild.dvdlibrarymvc.dto.DVD;
import com.thesoftwareguild.dvdlibrarymvc.dto.DVDCount;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author josephrohwer
 */
public class DVDLibraryDaoDbImpl implements DVDLibrary {

    private static final String SQL_INSERT_DVD
            = "insert into dvds (title, release_date, rating, director, studio, comment) values (?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_DVD
            = "delete from dvds where dvd_id = ?";
    private static final String SQL_SELECT_DVD
            = "select * from dvds where dvd_id = ?";
    private static final String SQL_UPDATE_DVD
            = "update dvds set title = ?, release_date = ?, rating = ?, director = ?, studio = ?, comment = ? where dvd_id = ?";
    private static final String SQL_SELECT_ALL_DVDS
            = "select * from dvds";
    private static final String SQL_SELECT_DVDS_BY_TITLE
            = "select * from dvds where title = ?";
    private static final String SQL_SELECT_DVDS_BY_RATING
            = "select * from dvds where rating = ?";
    private static final String SQL_SEARCH_DVDS
            = "select * from dvds where title like ? "
            + "AND title like ? "
            + "AND release_date like ? "
            + "AND director like ? "
            + "AND studio like ? "
            + "AND comment like ? ";
    private static final String SQL_SELECT_STUDIO_DVD_COUNTS
            = "SELECT studio, count(*) as num_dvds FROM dvds group by studio;";

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public DVD addDVD(DVD dvd) {
        jdbcTemplate.update(SQL_INSERT_DVD,
                dvd.getTitle(),
                dvd.getReleaseDate(),
                dvd.getRating(),
                dvd.getDirector(),
                dvd.getStudio(),
                dvd.getComment());
        dvd.setDvdId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()",
                Integer.class));
        return dvd;
    }

    @Override
    public void removeDVD(int dvdId) {
        jdbcTemplate.update(SQL_DELETE_DVD, dvdId);
    }

    @Override
    public void updateDVD(DVD dvd) {
        jdbcTemplate.update(SQL_UPDATE_DVD,
                dvd.getTitle(),
                dvd.getReleaseDate(),
                dvd.getRating(),
                dvd.getDirector(),
                dvd.getStudio(),
                dvd.getComment(),
                dvd.getDvdId());
    }

    @Override
    public List<DVD> getAllDVDS() {
        return jdbcTemplate.query(SQL_SELECT_ALL_DVDS, new DVDMapper());
    }

    @Override
    public DVD getDVD(int dvdId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_DVD,
                    new DVDMapper(), dvdId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<DVD> searchDVDS(Map<SearchTerm, String> criteria) {
        return jdbcTemplate.query(SQL_SEARCH_DVDS, new DVDMapper(), criteria.get(SearchTerm.TITLE) == null ? "%" : criteria.get(SearchTerm.TITLE), criteria.get(SearchTerm.RELEASE_DATE) == null ? "%" : criteria.get(SearchTerm.RELEASE_DATE), criteria.get(SearchTerm.RATING) == null ? "%" : criteria.get(SearchTerm.RATING), criteria.get(SearchTerm.DIRECTOR) == null ? "%" : criteria.get(SearchTerm.DIRECTOR), criteria.get(SearchTerm.STUDIO) == null ? "%" : criteria.get(SearchTerm.STUDIO), criteria.get(SearchTerm.COMMENT) == null ? "%" : criteria.get(SearchTerm.COMMENT));
    }

    @Override
    public List<DVDCount> getStudioDVDCounts() {
        return jdbcTemplate.query(SQL_SELECT_STUDIO_DVD_COUNTS,
                new DVDCountMapper());
    }

    private static final class DVDCountMapper
            implements RowMapper<DVDCount> {

        @Override
        public DVDCount mapRow(ResultSet rs, int i) throws SQLException {
            DVDCount count = new DVDCount();
            count.setStudio(rs.getString("studio"));
            count.setNumDVDS(rs.getInt("num_dvds"));
            return count;
        }
    }

    private static final class DVDMapper implements RowMapper<DVD> {

        @Override
        public DVD mapRow(ResultSet rs, int rowNum) throws SQLException {
            DVD dvd = new DVD();
            dvd.setDvdId(rs.getInt("dvd_id"));
            dvd.setTitle(rs.getString("title"));
            dvd.setReleaseDate(rs.getString("release_date"));
            dvd.setRating(rs.getString("rating"));
            dvd.setDirector(rs.getString("director"));
            dvd.setStudio(rs.getString("studio"));
            dvd.setComment(rs.getString("comment"));
            return dvd;
        }
    }
}
