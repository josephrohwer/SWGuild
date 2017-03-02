/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops5;

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
public class Loops5Test {

    public Loops5Test() {
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
     * Test of main method, of class Loops5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops5.main(args);
    }

    /**
     * Test of everyOther method, of class Loops5.
     */
    @Test
    public void test1EveryOther() {
        System.out.println("everyOther");
        Loops5 instance = new Loops5();
        String result = instance.everyOther("hello");
        assertEquals("hlo", result);
    }

    @Test
    public void test2EveryOther() {
        System.out.println("everyOther");
        Loops5 instance = new Loops5();
        String result = instance.everyOther("heeololeo");
        assertEquals("hello", result);
    }

    @Test
    public void test3EveryOther() {
        System.out.println("everyOther");
        Loops5 instance = new Loops5();
        String result = instance.everyOther("hi");
        assertEquals("h", result);
    }

}
