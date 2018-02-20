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
public class Logic14Test {

    public Logic14Test() {
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
     * Test of main method, of class Logic14.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic14.main(args);
    }

    /**
     * Test of areInOrder method, of class Logic14.
     */
    @Test
    public void test1AreInOrder() {
        System.out.println("areInOrder");
        Logic14 instance = new Logic14();
        boolean result = instance.areInOrder(1, 2, 4, false);
        assertEquals(true, result);
    }

    @Test
    public void test2AreInOrder() {
        System.out.println("areInOrder");
        Logic14 instance = new Logic14();
        boolean result = instance.areInOrder(1, 2, 1, false);
        assertEquals(false, result);
    }

    @Test
    public void test3AreInOrder() {
        System.out.println("areInOrder");
        Logic14 instance = new Logic14();
        boolean result = instance.areInOrder(1, 1, 2, true);
        assertEquals(true, result);
    }
}
