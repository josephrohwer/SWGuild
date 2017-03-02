/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class ContactDaoDbImpl implements ContactDao{
    private static final String SQL_SELECT_CONTACT
            = "select * from contact where contact_id = ?";
    private static final String SQL_INSERT_CONTACT
            = "insert into contact (phone, email, twitter, facebook) values (?, ?, ?, ?)";
    private static final String SQL_UPDATE_CONTACT
            = "update contact set phone = ?, email = ?, twitter = ?, facebook = ? where contact_id = ?";
    
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
 
    @Override
    public Contact getContact(int contactId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_CONTACT,
                    new ContactMapper(), contactId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Contact addContact(Contact ca) {
         jdbcTemplate.update(SQL_INSERT_CONTACT,
                ca.getPhone(),
                ca.getEmail(),
                ca.getTwitter(),
                ca.getFacebook());
        ca.setContactId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()",
                Integer.class));
        return ca;
    }

    @Override
    public void updateContact(Contact ca) {
        jdbcTemplate.update(SQL_UPDATE_CONTACT,
                ca.getPhone(),
                ca.getEmail(),
                ca.getTwitter(),
                ca.getFacebook(),
                ca.getContactId());
    }

    private class ContactMapper implements RowMapper<Contact> {

        public Contact mapRow(ResultSet rs, int i) throws SQLException {
            Contact c = new Contact();
            c.setContactId(rs.getInt("contact_id"));
            c.setPhone(rs.getString("phone"));
            c.setEmail(rs.getString("email"));
            c.setTwitter(rs.getString("twitter"));
            c.setFacebook(rs.getString("facebook"));   
            return c;
        }
    }
}
