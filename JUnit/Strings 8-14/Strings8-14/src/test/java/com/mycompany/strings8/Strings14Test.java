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
public class Strings14Test {

    public Strings14Test() {
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
     * Test of main method, of class Strings14.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings14.main(args);
    }

    /**
     * Test of frontAndBack method, of class Strings14.
     */
    @Test
    public void test1FrontAndBack() {
        System.out.println("frontAndBack");
        Strings14 instance = new Strings14();
        String result = instance.frontAndBack("hello", 2);
        assertEquals("helo", result);
    }

    @Test
    public void test2FrontAndBack() {
        System.out.println("frontAndBack");
        Strings14 instance = new Strings14();
        String result = instance.frontAndBack("chocolate", 3);
        assertEquals("choate", result);
    }

    @Test
    public void test3FrontAndBack() {
        System.out.println("frontAndBack");
        Strings14 instance = new Strings14();
        String result = instance.frontAndBack("chocolate", 1);
        assertEquals("ce", result);
    }

}
