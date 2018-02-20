/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strings8;

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
public class Strings8Test {

    public Strings8Test() {
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
     * Test of main method, of class Strings8.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings8.main(args);
    }

    /**
     * Test of longInMiddle method, of class Strings8.
     */
    @Test
    public void test1LongInMiddle() {
        System.out.println("longInMiddle");
        Strings8 instance = new Strings8();
        String result = instance.longInMiddle("hello", "hi");
        assertEquals("hihellohi", result);
    }

    @Test
    public void test2LongInMiddle() {
        System.out.println("longInMiddle");
        Strings8 instance = new Strings8();
        String result = instance.longInMiddle("hi", "hello");
        assertEquals("hihellohi", result);
    }

    @Test
    public void test3LongInMiddle() {
        System.out.println("longInMiddle");
        Strings8 instance = new Strings8();
        String result = instance.longInMiddle("aaa", "b");
        assertEquals("baaab", result);
    }

}
