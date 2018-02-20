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
public class Arrays11Test {

    public Arrays11Test() {
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
     * Test of main method, of class Arrays11.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays11.main(args);
    }

    /**
     * Test of keepLast method, of class Arrays11.
     */
    @Test
    public void test1KeepLast() {
        System.out.println("keepLast");
        int[] a = {4, 5, 6};
        int[] b = {0, 0, 0, 0, 0, 6};
        Arrays11 instance = new Arrays11();
        int[] result = instance.keepLast(a);
        assertArrayEquals(b, result);
    }

    @Test
    public void test2KeepLast() {
        System.out.println("keepLast");
        int[] a = {1, 2};
        int[] b = {0, 0, 0, 2};
        Arrays11 instance = new Arrays11();
        int[] result = instance.keepLast(a);
        assertArrayEquals(b, result);
    }

    @Test
    public void test3KeepLast() {
        System.out.println("keepLast");
        int[] a = {3};
        int[] b = {0, 3};
        Arrays11 instance = new Arrays11();
        int[] result = instance.keepLast(a);
        assertArrayEquals(b, result);
    }

}
