/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops8;

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
public class Loops13Test {

    public Loops13Test() {
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
     * Test of main method, of class Loops13.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops13.main(args);
    }

    /**
     * Test of altPairs method, of class Loops13.
     */
    @Test
    public void test1AltPairs() {
        System.out.println("altPairs");
        Loops13 instance = new Loops13();
        String result = instance.altPairs("kitten");
        assertEquals("kien", result);
    }

    @Test
    public void test2AltPairs() {
        System.out.println("altPairs");
        Loops13 instance = new Loops13();
        String result = instance.altPairs("chocolate");
        assertEquals("chole", result);
    }

    @Test
    public void test3AltPairs() {
        System.out.println("altPairs");
        Loops13 instance = new Loops13();
        String result = instance.altPairs("codinghorror");
        assertEquals("congrr", result);
    }
}
