/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Arrays4Test {

    public Arrays4Test() {
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
     * Test of main method, of class Arrays4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays4.main(args);
    }

    /**
     * Test of commonEnd method, of class Arrays4.
     */
    @Test
    public void test1CommonEnd() {
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
        Arrays4 instance = new Arrays4();
        boolean result = instance.commonEnd(a, b);
        assertEquals(true, result);
    }

    @Test
    public void test2CommonEnd() {
        int[] a = {1, 2, 3};
        int[] b = {7, 3, 2};
        Arrays4 instance = new Arrays4();
        boolean result = instance.commonEnd(a, b);
        assertEquals(false, result);
    }

    @Test
    public void test3CommonEnd() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        Arrays4 instance = new Arrays4();
        boolean result = instance.commonEnd(a, b);
        assertEquals(true, result);
    }

}
