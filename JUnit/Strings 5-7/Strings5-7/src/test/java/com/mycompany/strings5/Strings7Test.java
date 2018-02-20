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
public class Strings7Test {

    public Strings7Test() {
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
     * Test of main method, of class Strings7.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings7.main(args);
    }

    /**
     * Test of trimOne method, of class Strings7.
     */
    @Test
    public void test1TrimOne() {
        System.out.println("trimOne");
        Strings7 instance = new Strings7();
        String result = instance.trimOne("hello");
        assertEquals("ell", result);
    }

    @Test
    public void test2TrimOne() {
        System.out.println("trimOne");
        Strings7 instance = new Strings7();
        String result = instance.trimOne("java");
        assertEquals("av", result);
    }

    @Test
    public void test3TrimOne() {
        System.out.println("trimOne");
        Strings7 instance = new Strings7();
        String result = instance.trimOne("coding");
        assertEquals("odin", result);
    }

}
