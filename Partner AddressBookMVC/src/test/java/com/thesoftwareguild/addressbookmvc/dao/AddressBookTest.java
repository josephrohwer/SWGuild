/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.dao;

import com.thesoftwareguild.addressbookmvc.dto.Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class AddressBookTest {
    
    private AddressBook dao;
    
    public AddressBookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("AddressBookDao", AddressBook.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAddress method, of class AddressBook.
     */
    @Test
    public void testAddRemoveGetAddress() {
        Address na = new Address("Bill", "Clinton", "400 White Bear Ave", "White Bear Lake", "MN", "55492");
        dao.addAddress(na);
        Address fromDb = dao.getAddress(na.getAddressId());
        assertEquals(fromDb, na);
        
        dao.removeAddress(na.getAddressId());
        assertNull(dao.getAddress(na.getAddressId()));
    }

    /**
     * Test of updateAddress method, of class AddressBook.
     */
    @Test
    public void testUpdateAddress() {
        Address na = new Address("Bill", "Clinton", "400 White Bear Ave", "White Bear Lake", "MN", "55492");
        dao.addAddress(na);
        
        na.setLastName("Trump");
        dao.updateAddress(na);
        
        Address fromDb = dao.getAddress(na.getAddressId());
        assertEquals(fromDb, na);
    }

    /**
     * Test of getAllAddresses method, of class AddressBook.
     */
    @Test
    public void testGetAllAddresses() {
        Address na = new Address("Bill", "Clinton", "400 White Bear Ave", "White Bear Lake", "MN", "55492");
        Address na2 = new Address("Ronald", "Drumpf", "100 Nowhere St", "Maplewood", "MN", "55328");
        dao.addAddress(na2);
        dao.addAddress(na);
        
        List<Address> fromDb = dao.getAllAddresses();
        assertEquals(2, fromDb.size());
        assertTrue(fromDb.contains(na));
    }


    /**
     * Test of searchAddresses method, of class AddressBook.
     */
    @Test
    public void testSearchAddresses() {
        Address na = new Address("Bill", "Clinton", "400 White Bear Ave", "White Bear Lake", "MN", "55492");
        Address na2 = new Address("Ronald", "Drumpf", "100 Nowhere St", "Maplewood", "MN", "55328");
        Address na3 = new Address("John", "Johnson", "489 John St", "Johnsonville", "Johntown", "12345");
        
        dao.addAddress(na);
        dao.addAddress(na2);
        dao.addAddress(na3);
        
        Map<SearchTerm, String> criteria = new HashMap<>();
        criteria.put(SearchTerm.CITY, "Maplewood");
        List<Address> searchList = dao.searchAddresses(criteria);
        assertEquals(1, searchList.size());
        assertEquals(na2, searchList.get(0));
        
        criteria.put(SearchTerm.CITY, "");
        
        criteria.put(SearchTerm.STATE, "MN");
        searchList = dao.searchAddresses(criteria);
        assertEquals(2, searchList.size());
        assertTrue(searchList.contains(na2));
        assertTrue(searchList.contains(na));
    }
    
}
