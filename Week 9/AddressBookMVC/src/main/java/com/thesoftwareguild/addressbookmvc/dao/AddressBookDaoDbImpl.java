/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.dao;

import com.thesoftwareguild.addressbookmvc.dto.Address;
import com.thesoftwareguild.addressbookmvc.dto.StateAddressCount;
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
public class AddressBookDaoDbImpl implements AddressBook {

    private static final String SQL_INSERT_ADDRESS
            = "insert into addresses (first_name, last_name, address, city, state, zip_code) values (?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_ADDRESS
            = "delete from addresses where address_id = ?";
    private static final String SQL_SELECT_ADDRESS
            = "select * from addresses where address_id = ?";
    private static final String SQL_UPDATE_ADDRESS
            = "update addresses set first_name = ?, last_name = ?, address = ?, city = ?, state = ?, zip_code = ? where address_id = ?";
    private static final String SQL_SELECT_ALL_ADDRESSES
            = "select * from addresses";
    private static final String SQL_SELECT_STATE_ADDRESS_COUNTS
            = "SELECT state, count(*) as num_addresses FROM addresses group by state;";
    private static final String SQL_SEARCH_ADDRESSES
            = "select * from addresses where first_name like ?"
            + "AND last_name like ?"
            + "AND address like ?"
            + "AND city like ?"
            + "AND state like ?"
            + "AND zip_code like ?";
    private static final String SQL_SELECT_ADDRESSES_BY_LAST_NAME
            = "select * from addresses where last_name = ?";
    private static final String SQL_SELECT_ADDRESSES_BY_STATE
            = "select * from addresses where state = ?";

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Address addAddress(Address address) {
        jdbcTemplate.update(SQL_INSERT_ADDRESS,
                address.getFirstName(),
                address.getLastName(),
                address.getAddress(),
                address.getCity(),
                address.getState(),
                address.getZipCode());
        address.setAddressId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()",
                Integer.class));
        return address;
    }

    @Override
    public void removeAddress(int addressId) {
        jdbcTemplate.update(SQL_DELETE_ADDRESS, addressId);
    }

    @Override
    public void updateAddress(Address address) {
        jdbcTemplate.update(SQL_UPDATE_ADDRESS,
                address.getFirstName(),
                address.getLastName(),
                address.getAddress(),
                address.getCity(),
                address.getState(),
                address.getZipCode(),
                address.getAddressId());
    }

    @Override
    public List<Address> getAllAddresses() {
        return jdbcTemplate.query(SQL_SELECT_ALL_ADDRESSES, new AddressMapper());
    }

    @Override
    public Address getAddress(int addressId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_ADDRESS,
                    new AddressMapper(), addressId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<Address> searchAddresses(Map<SearchTerm, String> criteria) {
        return jdbcTemplate.query(SQL_SEARCH_ADDRESSES, new AddressMapper(),
                criteria.get(SearchTerm.FIRST_NAME) == null ? "%" : criteria.get(SearchTerm.FIRST_NAME),
                criteria.get(SearchTerm.LAST_NAME) == null ? "%" : criteria.get(SearchTerm.LAST_NAME),
                criteria.get(SearchTerm.ADDRESS) == null ? "%" : criteria.get(SearchTerm.ADDRESS),
                criteria.get(SearchTerm.CITY) == null ? "%" : criteria.get(SearchTerm.CITY),
                criteria.get(SearchTerm.STATE) == null ? "%" : criteria.get(SearchTerm.STATE),
                criteria.get(SearchTerm.ZIPCODE) == null ? "%" : criteria.get(SearchTerm.ZIPCODE));
    }

    @Override
    public List<StateAddressCount> getStateAddressCounts() {
        return jdbcTemplate.query(SQL_SELECT_STATE_ADDRESS_COUNTS,
                new StateAddressCountManager());
    }

    private static final class AddressMapper implements RowMapper<Address> {

        public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
            Address address = new Address();
            address.setAddressId(rs.getInt("address_id"));
            address.setFirstName(rs.getString("first_name"));
            address.setLastName(rs.getString("last_name"));
            address.setAddress(rs.getString("address"));
            address.setCity(rs.getString("city"));
            address.setState(rs.getString("state"));
            address.setZipCode(rs.getString("zip_code"));
            return address;
        }
    }

    private static final class StateAddressCountManager
            implements RowMapper<StateAddressCount> {

        @Override
        public StateAddressCount mapRow(ResultSet rs, int i) throws SQLException {
            StateAddressCount count = new StateAddressCount();
            count.setState(rs.getString("state"));
            count.setNumAddresses(rs.getInt("num_addresses"));
            return count;
        }
    }
}
