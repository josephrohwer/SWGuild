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
public class Loops12Test {

    public Loops12Test() {
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
     * Test of main method, of class Loops12.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops12.main(args);
    }

    /**
     * Test of stringX method, of class Loops12.
     */
    @Test
    public void test1StringX() {
        System.out.println("stringX");
        Loops12 instance = new Loops12();
        String result = instance.stringX("xxhxix");
        assertEquals("xhix", result);
    }

    @Test
    public void test2StringX() {
        System.out.println("stringX");
        Loops12 instance = new Loops12();
        String result = instance.stringX("abxxxcd");
        assertEquals("abcd", result);
    }

    @Test
    public void test3StringX() {
        System.out.println("stringX");
        Loops12 instance = new Loops12();
        String result = instance.stringX("xabxxxcdx");
        assertEquals("xabcdx", result);
    }
}
