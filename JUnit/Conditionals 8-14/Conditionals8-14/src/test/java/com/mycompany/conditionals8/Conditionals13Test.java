/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephrohwer
 */
public class Conditionals13Test {

    public Conditionals13Test() {
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
     * Test of main method, of class Conditionals13.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals13.main(args);
    }

    /**
     * Test of backAround method, of class Conditionals13.
     */
    @Test
    public void test1BackAround() {
        System.out.println("backAround");
        Conditionals13 instance = new Conditionals13();
        String result = instance.backAround("cat");
        assertEquals("tcatt", result);
    }

    @Test
    public void test2BackAround() {
        System.out.println("backAround");
        Conditionals13 instance = new Conditionals13();
        String result = instance.backAround("hello");
        assertEquals("ohelloo", result);
    }

    @Test
    public void test3BackAround() {
        System.out.println("backAround");
        Conditionals13 instance = new Conditionals13();
        String result = instance.backAround("a");
        assertEquals("aaa", result);
    }

}
