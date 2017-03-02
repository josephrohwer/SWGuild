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
public class Conditionals10Test {

    public Conditionals10Test() {
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
     * Test of main method, of class Conditionals10.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals10.main(args);
    }

    /**
     * Test of missingChar method, of class Conditionals10.
     */
    @Test
    public void test1MissingChar() {
        System.out.println("missingChar");
        Conditionals10 instance = new Conditionals10();
        String result = instance.missingChar("kitten", 1);
        assertEquals("ktten", result);
    }

    @Test
    public void test2MissingChar() {
        System.out.println("missingChar");
        Conditionals10 instance = new Conditionals10();
        String result = instance.missingChar("kitten", 0);
        assertEquals("itten", result);
    }

    @Test
    public void test3MissingChar() {
        System.out.println("missingChar");
        Conditionals10 instance = new Conditionals10();
        String result = instance.missingChar("kitten", 4);
        assertEquals("kittn", result);
    }

}
