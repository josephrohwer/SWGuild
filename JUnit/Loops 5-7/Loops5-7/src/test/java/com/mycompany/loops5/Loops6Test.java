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
public class Loops6Test {

    public Loops6Test() {
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
     * Test of main method, of class Loops6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops6.main(args);
    }

    /**
     * Test of stringSplosion method, of class Loops6.
     */
    @Test
    public void test1StringSplosion() {
        System.out.println("stringSplosion");
        Loops6 instance = new Loops6();
        String result = instance.stringSplosion("Code");
        assertEquals("CCoCodCode", result);
    }

    @Test
    public void test2StringSplosion() {
        System.out.println("stringSplosion");
        Loops6 instance = new Loops6();
        String result = instance.stringSplosion("abc");
        assertEquals("aababc", result);
    }

    @Test
    public void test3StringSplosion() {
        System.out.println("stringSplosion");
        Loops6 instance = new Loops6();
        String result = instance.stringSplosion("ab");
        assertEquals("aab", result);
    }
}
