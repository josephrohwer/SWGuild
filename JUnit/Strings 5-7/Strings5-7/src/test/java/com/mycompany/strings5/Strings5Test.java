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
public class Strings5Test {

    public Strings5Test() {
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
     * Test of main method, of class Strings5.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings5.main(args);
    }

    /**
     * Test of multipleEnding method, of class Strings5.
     */
    @org.junit.Test
    public void test1MultipleEnding() {
        System.out.println("multipleEnding");
        Strings5 instance = new Strings5();
        String result = instance.multipleEnding("hello");
        assertEquals("lololo", result);
    }

    @org.junit.Test
    public void test2MultipleEnding() {
        System.out.println("multipleEnding");
        Strings5 instance = new Strings5();
        String result = instance.multipleEnding("ab");
        assertEquals("ababab", result);
    }

    @org.junit.Test
    public void test3MultipleEnding() {
        System.out.println("multipleEnding");
        Strings5 instance = new Strings5();
        String result = instance.multipleEnding("hi");
        assertEquals("hihihi", result);
    }

}
