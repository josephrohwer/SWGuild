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
public class Arrays8Test {

    public Arrays8Test() {
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
     * Test of main method, of class Arrays8.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays8.main(args);
    }

    /**
     * Test of higherWins method, of class Arrays8.
     */
    @Test
    public void test1HigherWins() {
        System.out.println("higherWins");
        int[] a = {1, 2, 3};
        int[] b = {3, 3, 3};
        Arrays8 instance = new Arrays8();
        int[] result = instance.higherWins(a);
        assertArrayEquals(b, result);
    }

    @Test
    public void test2HigherWins() {
        System.out.println("higherWins");
        int[] a = {11, 5, 9};
        int[] b = {11, 11, 11};
        Arrays8 instance = new Arrays8();
        int[] result = instance.higherWins(a);
        assertArrayEquals(b, result);
    }

    @Test
    public void test3HigherWins() {
        System.out.println("higherWins");
        int[] a = {1, 2, 4};
        int[] b = {4, 4, 4};
        Arrays8 instance = new Arrays8();
        int[] result = instance.higherWins(a);
        assertArrayEquals(b, result);
    }

}
