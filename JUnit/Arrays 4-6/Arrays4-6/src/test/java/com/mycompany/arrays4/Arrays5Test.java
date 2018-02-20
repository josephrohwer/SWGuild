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
public class Arrays5Test {

    public Arrays5Test() {
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
     * Test of main method, of class Arrays5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays5.main(args);
    }

    /**
     * Test of sum method, of class Arrays5.
     */
    @Test
    public void test1Sum() {
        System.out.println("sum");
        int[] a = {1, 2, 3};
        Arrays5 instance = new Arrays5();
        int result = instance.sum(a);
        assertEquals(6, result);
    }

    @Test
    public void test2Sum() {
        System.out.println("sum");
        int[] a = {5, 11, 2};
        Arrays5 instance = new Arrays5();
        int result = instance.sum(a);
        assertEquals(18, result);
    }

    @Test
    public void test3Sum() {
        System.out.println("sum");
        int[] a = {7, 0, 0};
        Arrays5 instance = new Arrays5();
        int result = instance.sum(a);
        assertEquals(7, result);
    }

}
