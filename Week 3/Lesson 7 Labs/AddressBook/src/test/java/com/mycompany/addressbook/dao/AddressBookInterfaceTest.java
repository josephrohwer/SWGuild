/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.dao;

import com.mycompany.addressbook.dto.Address;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephrohwer
 */
public class AddressBookInterfaceTest {

    AddressBookInterface instance;
    List<Address> startingAddresses;

    public AddressBookInterfaceTest() {
        instance = new AddressBook();
        startingAddresses = new ArrayList<>();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    //here
    @Before
    public void setUp() {
        //setUp occurs before each test method.
        //we use it to ensure that the DAO being tested is in a 

        //first erase whatever happens to be in the DAO and in our local copy
        startingAddresses.clear();
        List<Address> addresses = instance.getAddresses();
        for (Address s : addresses) {
            instance.removeAddress(s.getLastName());
        }

        //then add known data into the DAO and our local copy
        startingAddresses.add(instance.addAddress(new Address("Joseph", "Rohwer", "107 North Oak Street", "Sutherland Iowa 51058")));
        startingAddresses.add(instance.addAddress(new Address("Alex", "Steig", "402 South Fleet Street", "Paullina Minnesota 55402")));
        startingAddresses.add(instance.addAddress(new Address("Abrahm", "Stevens", "875 North Maple Street", "Spencer Colorado 12345")));
        startingAddresses.add(instance.addAddress(new Address("John", "Smith", "197 South Pine Street", "Cherokee Michigan 22093")));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addAddress method, of class AddressBookInterface.
     */
    @Test
    public void testAddAddress() {
        System.out.println("addAddress");
        Address e = instance.addAddress(new Address("asdf", "ffff", "lmnop", "qrst"));
    }

    /**
     * Test of removeAddress method, of class AddressBookInterface.
     */
    @Test
    public void testRemoveAddress() {
        System.out.println("removeAddress");
        String lastName = "";
        //AddressBookInterface instance = new AddressBookInterfaceImpl();
        instance.removeAddress(lastName);
    }

    /**
     * Test of findAddress method, of class AddressBookInterface.
     */
    @Test
    public void testFindAddress() {
        System.out.println("findAddress");
        String lastName = "";
        //AddressBookInterface instance = new AddressBookInterfaceImpl();
        List<Address> expResult = null;
        List<Address> result = instance.findAddress(lastName);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAddressCity method, of class AddressBookInterface.
     */
    @Test
    public void testFindAddressCity() {
        System.out.println("findAddressCity");
        String city = "";
        //AddressBookInterface instance = new AddressBookInterfaceImpl();
        List<Address> expResult = null;
        List<Address> result = instance.findAddressCity(city);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAddressState method, of class AddressBookInterface.
     */
    @Test
    public void testFindAddressState() {
        System.out.println("findAddressState");
        String state = "";
        //AddressBookInterface instance = new AddressBookInterfaceImpl();
        List<Address> expResult = null;
        List<Address> result = instance.findAddressState(state);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAddressZip method, of class AddressBookInterface.
     */
    @Test
    public void testFindAddressZip() {
        System.out.println("findAddressZip");
        String zipcode = "";
        //AddressBookInterface instance = new AddressBookInterfaceImpl();
        List<Address> expResult = null;
        List<Address> result = instance.findAddressZip(zipcode);
        assertEquals(expResult, result);
    }

    /**
     * Test of addressCount method, of class AddressBookInterface.
     */
    @Test
    public void testAddressCount() {
        System.out.println("addressCount");
        //AddressBookInterface instance = new AddressBookInterfaceImpl();
        int expResult = 0;
        int result = instance.addressCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of addressList method, of class AddressBookInterface.
     */
    @Test
    public void testAddressList() {
        System.out.println("addressList");
        //AddressBookInterface instance = new AddressBookInterfaceImpl();
        List<Address> expResult = null;
        List<Address> result = instance.addressList();
        assertEquals(expResult, result);
    }
}
