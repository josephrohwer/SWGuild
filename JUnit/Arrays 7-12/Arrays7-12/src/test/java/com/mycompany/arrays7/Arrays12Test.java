/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays7;

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
public class Arrays12Test {

    public Arrays12Test() {
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
     * Test of main method, of class Arrays12.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays12.main(args);
    }

    /**
     * Test of double23 method, of class Arrays12.
     */
    @Test
    public void test1Double23() {
        System.out.println("double23");
        int[] a = {2, 2, 3};
        Arrays12 instance = new Arrays12();
        boolean result = instance.double23(a);
        assertEquals(true, result);
    }

    @Test
    public void test2Double23() {
        System.out.println("double23");
        int[] a = {3, 4, 5, 3};
        Arrays12 instance = new Arrays12();
        boolean result = instance.double23(a);
        assertEquals(true, result);
    }

    @Test
    public void test3Double23() {
        System.out.println("double23");
        int[] a = {2, 3, 2, 2};
        Arrays12 instance = new Arrays12();
        boolean result = instance.double23(a);
        assertEquals(false, result);
    }

}
