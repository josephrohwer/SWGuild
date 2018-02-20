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
public class Strings10Test {

    public Strings10Test() {
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
     * Test of main method, of class Strings10.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings10.main(args);
    }

    /**
     * Test of rotateLeft2 method, of class Strings10.
     */
    @Test
    public void test1RotateRight2() {
        System.out.println("rotateRight2");
        Strings10 instance = new Strings10();
        String result = instance.rotateRight2("hello");
        assertEquals("lohel", result);
    }

    @Test
    public void test2RotateRight2() {
        System.out.println("rotateRight2");
        Strings10 instance = new Strings10();
        String result = instance.rotateRight2("java");
        assertEquals("vaja", result);
    }

    @Test
    public void test3RotateRight2() {
        System.out.println("rotateRight2");
        Strings10 instance = new Strings10();
        String result = instance.rotateRight2("hi");
        assertEquals("hi", result);
    }
}
