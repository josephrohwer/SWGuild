/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals4;

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
public class Conditionals6Test {

    public Conditionals6Test() {
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
     * Test of main method, of class Conditionals6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals6.main(args);
    }

    /**
     * Test of makes10 method, of class Conditionals6.
     */
    @Test
    public void test1Makes10() {
        System.out.println("makes10");
        Conditionals6 instance = new Conditionals6();
        boolean result = instance.makes10(9, 10);
        assertEquals(true, result);
    }

    @Test
    public void test2Makes10() {
        System.out.println("makes10");
        Conditionals6 instance = new Conditionals6();
        boolean result = instance.makes10(9, 9);
        assertEquals(false, result);
    }

    @Test
    public void test3Makes10() {
        System.out.println("makes10");
        Conditionals6 instance = new Conditionals6();
        boolean result = instance.makes10(1, 9);
        assertEquals(true, result);
    }

}
