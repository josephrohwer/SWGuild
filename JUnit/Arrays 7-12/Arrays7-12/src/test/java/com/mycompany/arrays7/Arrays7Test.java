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
public class Arrays7Test {

    public Arrays7Test() {
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
     * Test of main method, of class Arrays7.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays7.main(args);
    }

    /**
     * Test of reverse method, of class Arrays7.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        Arrays7 instance = new Arrays7();
        int[] result = instance.reverse(a);
        assertArrayEquals(b, result);
    }

}
