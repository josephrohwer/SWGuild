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
public class Strings9Test {

    public Strings9Test() {
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
     * Test of main method, of class Strings9.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings9.main(args);
    }

    /**
     * Test of rotateLef2 method, of class Strings9.
     */
    @Test
    public void test1RotateLeft2() {
        System.out.println("rotateLeft2");
        Strings9 instance = new Strings9();
        String result = instance.rotateLeft2("hello");
        assertEquals("llohe", result);
    }

    @Test
    public void test2RotateLeft2() {
        System.out.println("rotateLeft2");
        Strings9 instance = new Strings9();
        String result = instance.rotateLeft2("java");
        assertEquals("vaja", result);
    }

    @Test
    public void test3rotateLeft2() {
        System.out.println("rotateLeft2");
        Strings9 instance = new Strings9();
        String result = instance.rotateLeft2("hi");
        assertEquals("hi", result);
    }

}
