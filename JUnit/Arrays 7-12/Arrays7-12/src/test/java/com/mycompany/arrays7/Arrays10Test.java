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
public class Arrays10Test {

    public Arrays10Test() {
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
     * Test of main method, of class Arrays10.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays10.main(args);
    }

    /**
     * Test of hasEven method, of class Arrays10.
     */
    @Test
    public void test1HasEven() {
        System.out.println("hasEven");
        int[] a = {2, 5};
        Arrays10 instance = new Arrays10();
        boolean result = instance.hasEven(a);
        assertEquals(true, result);
    }

    @Test
    public void test2HasEven() {
        System.out.println("hasEven");
        int[] a = {4, 3};
        Arrays10 instance = new Arrays10();
        boolean result = instance.hasEven(a);
        assertEquals(true, result);
    }

    @Test
    public void test3HasEven() {
        System.out.println("hasEven");
        int[] a = {7, 5};
        Arrays10 instance = new Arrays10();
        boolean result = instance.hasEven(a);
        assertEquals(false, result);
    }

}
