/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.StaticContent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class StaticContentDbImpl implements StaticContentDao{
    private static final String SQL_SELECT_STATIC
            = "select * from statics where static_id = ?";
    private static final String SQL_INSERT_STATIC
            = "insert into statics (title, staticBody) values (?, ?)";
    private static final String SQL_UPDATE_STATIC
            = "update statics set title = ?, staticBody = ? where static_id = ?";
    private static final String SQL_DELETE_STATIC
            = "delete from statics where static_id = ?";
    private static final String SQL_SELECT_ALL_STATICS
            = "select * from statics";
    
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public StaticContent getStaticContent(int id) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_STATIC,
                    new StaticMapper(), id);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public StaticContent addStaticContent(StaticContent sc) {
        jdbcTemplate.update(SQL_INSERT_STATIC,
                sc.getTitle(),
                sc.getStaticBody());
        sc.setStaticId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()",
                Integer.class));
        return sc;
    }

    @Override
    public void updateStaticContent(StaticContent sc) {
       jdbcTemplate.update(SQL_UPDATE_STATIC,
                sc.getTitle(),
                sc.getStaticBody(),
                sc.getStaticId());
    }

    @Override
    public List<StaticContent> getAllContent() {
        return jdbcTemplate.query(SQL_SELECT_ALL_STATICS, new StaticMapper());
    }

    @Override
    public void deleteStaticContent(int id) {
        jdbcTemplate.update(SQL_DELETE_STATIC, id);
    }
    
     private class StaticMapper implements RowMapper<StaticContent> {

        @Override
        public StaticContent mapRow(ResultSet rs, int i) throws SQLException {
            StaticContent c = new StaticContent();
            c.setStaticId(rs.getInt("static_id"));
            c.setTitle(rs.getString("title"));
            c.setStaticBody(rs.getString("staticBody"));   
            return c;
        }
    }
    
}
