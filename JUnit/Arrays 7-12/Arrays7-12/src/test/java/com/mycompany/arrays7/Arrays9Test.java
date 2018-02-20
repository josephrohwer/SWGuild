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
public class Arrays9Test {

    public Arrays9Test() {
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
     * Test of main method, of class Arrays9.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays9.main(args);
    }

    /**
     * Test of getMiddle method, of class Arrays9.
     */
    @Test
    public void test1GetMiddle() {
        System.out.println("getMiddle");
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {2, 5};
        Arrays9 instance = new Arrays9();
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(c, result);
    }

    @Test
    public void test2GetMiddle() {
        System.out.println("getMiddle");
        int[] a = {7, 7, 7};
        int[] b = {3, 8, 0};
        int[] c = {7, 8};
        Arrays9 instance = new Arrays9();
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(c, result);
    }

    @Test
    public void test3GetMiddle() {
        System.out.println("getMiddle");
        int[] a = {5, 2, 9};
        int[] b = {1, 4, 5};
        int[] c = {2, 4};
        Arrays9 instance = new Arrays9();
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(c, result);
    }

}
