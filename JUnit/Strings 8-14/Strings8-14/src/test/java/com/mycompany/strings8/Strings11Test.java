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
public class Strings11Test {

    public Strings11Test() {
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
     * Test of main method, of class Strings11.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings11.main(args);
    }

    /**
     * Test of takeOne method, of class Strings11.
     */
    @Test
    public void test1TakeOne() {
        System.out.println("takeOne");
        Strings11 instance = new Strings11();
        String result = instance.takeOne("hello", true);
        assertEquals("h", result);
    }

    @Test
    public void test2TakeOne() {
        System.out.println("takeOne");
        Strings11 instance = new Strings11();
        String result = instance.takeOne("hello", false);
        assertEquals("o", result);
    }

    @Test
    public void test3TakeOne() {
        System.out.println("takeOne");
        Strings11 instance = new Strings11();
        String result = instance.takeOne("oh", true);
        assertEquals("o", result);
    }

}
