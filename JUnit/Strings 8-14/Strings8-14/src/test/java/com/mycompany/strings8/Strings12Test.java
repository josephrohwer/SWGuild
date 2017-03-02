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
public class Strings12Test {

    public Strings12Test() {
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
     * Test of main method, of class Strings12.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings12.main(args);
    }

    /**
     * Test of middleTwo method, of class Strings12.
     */
    @Test
    public void test1MiddleTwo() {
        System.out.println("middleTwo");
        Strings12 instance = new Strings12();
        String result = instance.middleTwo("string");
        assertEquals("ri", result);
    }

    @Test
    public void test2MiddleTwo() {
        System.out.println("middleTwo");
        Strings12 instance = new Strings12();
        String result = instance.middleTwo("code");
        assertEquals("od", result);
    }

    @Test
    public void test3MiddleTwo() {
        System.out.println("middleTwo");
        Strings12 instance = new Strings12();
        String result = instance.middleTwo("practice");
        assertEquals("ct", result);
    }

}
