/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strings5;

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
public class Strings6Test {

    public Strings6Test() {
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
     * Test of main method, of class Strings6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings6.main(args);
    }

    /**
     * Test of firstHalf method, of class Strings6.
     */
    @Test
    public void test1FirstHalf() {
        System.out.println("firstHalf");
        Strings6 instance = new Strings6();
        String result = instance.firstHalf("woohoo");
        assertEquals("woo", result);
    }

    @Test
    public void test2FirstHalf() {
        System.out.println("firstHalf");
        Strings6 instance = new Strings6();
        String result = instance.firstHalf("hellothere");
        assertEquals("hello", result);
    }

    @Test
    public void test3FirstHalf() {
        System.out.println("firstHalf");
        Strings6 instance = new Strings6();
        String result = instance.firstHalf("abcdef");
        assertEquals("abc", result);
    }

}
