/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.contactlistmvc.dao;

import com.thesoftwareguild.contactlistmvc.dto.CompanyContactCount;
import com.thesoftwareguild.contactlistmvc.dto.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class ContactListDaoDbImpl implements ContactListDao {

    private static final String SQL_INSERT_CONTACT
            = "insert into contacts (first_name, last_name, company, phone, email) values (?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_CONTACT
            = "delete from contacts where contact_id = ?";
    private static final String SQL_SELECT_CONTACT
            = "select * from contacts where contact_id = ?";
    private static final String SQL_UPDATE_CONTACT
            = "update contacts set first_name = ?, last_name = ?, company = ?, phone = ?, email = ? where contact_id = ?";
    private static final String SQL_SELECT_ALL_CONTACTS
            = "select * from contacts";
    private static final String SQL_SELECT_CONTACTS_BY_LAST_NAME
            = "select * from contacts where last_name = ?";
    private static final String SQL_SELECT_CONTACTS_BY_COMPANY
            = "select * from contacts where company = ?";
    private static final String SQL_SEARCH_CONTACTS
            = "Select * from contacts where first_name like ? "
            + "AND last_name like ? "
            + "AND company like ? "
            + "AND phone  like  ? "
            + "AND email like  ? ";
    private static final String SQL_SELECT_COMPANY_CONTACT_COUNTS
            = "SELECT company, count(*) as num_contacts FROM contacts group by company;";

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Contact addContact(Contact contact) {
        jdbcTemplate.update(SQL_INSERT_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getCompany(),
                contact.getPhone(),
                contact.getEmail());
        contact.setContactId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()",
                Integer.class));
        return contact;
    }

    @Override
    public void removeContact(int contactId) {
        jdbcTemplate.update(SQL_DELETE_CONTACT, contactId);
    }

    @Override
    public void updateContact(Contact contact) {
        jdbcTemplate.update(SQL_UPDATE_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getCompany(),
                contact.getPhone(),
                contact.getEmail(),
                contact.getContactId());
    }

    @Override
    public List<Contact> getAllContacts() {
        return jdbcTemplate.query(SQL_SELECT_ALL_CONTACTS, new ContactMapper());
    }

    @Override
    public Contact getContactById(int contactId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_CONTACT,
                    new ContactMapper(), contactId);
        } catch (EmptyResultDataAccessException ex) {
// there were no results for the given contact id - we just want to
// return null in this case
            return null;
        }
    }

    @Override
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria) {
        return jdbcTemplate.query(SQL_SEARCH_CONTACTS, new ContactMapper(), criteria.get(SearchTerm.FIRST_NAME) == null ? "%" : criteria.get(SearchTerm.FIRST_NAME), criteria.get(SearchTerm.LAST_NAME) == null ? "%" : criteria.get(SearchTerm.LAST_NAME), criteria.get(SearchTerm.COMPANY) == null ? "%" : criteria.get(SearchTerm.COMPANY), criteria.get(SearchTerm.PHONE) == null ? "%" : criteria.get(SearchTerm.PHONE), criteria.get(SearchTerm.EMAIL) == null ? "%" : criteria.get(SearchTerm.EMAIL));
    }

    @Override
    public List<CompanyContactCount> getCompanyContactCounts() {
        return jdbcTemplate.query(SQL_SELECT_COMPANY_CONTACT_COUNTS,
                new CompanyContactCountMapper());
    }

    private static final class ContactMapper implements RowMapper<Contact> {

        public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
            Contact contact = new Contact();
            contact.setContactId(rs.getInt("contact_id"));
            contact.setFirstName(rs.getString("first_name"));
            contact.setLastName(rs.getString("last_name"));
            contact.setCompany(rs.getString("company"));
            contact.setPhone(rs.getString("phone"));
            contact.setEmail(rs.getString("email"));
            return contact;
        }
    }

    private static final class CompanyContactCountMapper implements RowMapper<CompanyContactCount> {

        @Override
        public CompanyContactCount mapRow(ResultSet rs, int i) throws SQLException {
            CompanyContactCount count = new CompanyContactCount();
            count.setCompany(rs.getString("company"));
            count.setNumContacts(rs.getInt("num_contacts"));
            return count;
        }
    }

}
