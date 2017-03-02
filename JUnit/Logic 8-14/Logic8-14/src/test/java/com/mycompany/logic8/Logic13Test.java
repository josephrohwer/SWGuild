/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic8;

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
public class Logic13Test {

    public Logic13Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Logic13.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic13.main(args);
    }

    /**
     * Test of twoIsOne method, of class Logic13.
     */
    @Test
    public void test1TwoIsOne() {
        System.out.println("twoIsOne");
        Logic13 instance = new Logic13();
        boolean result = instance.twoIsOne(1, 2, 3);
        assertEquals(true, result);
    }

    @Test
    public void test2TwoIsOne() {
        System.out.println("twoIsOne");
        Logic13 instance = new Logic13();
        boolean result = instance.twoIsOne(3, 1, 2);
        assertEquals(true, result);
    }

    @Test
    public void test3TwoIsOne() {
        System.out.println("twoIsOne");
        Logic13 instance = new Logic13();
        boolean result = instance.twoIsOne(3, 2, 2);
        assertEquals(false, result);
    }

}
