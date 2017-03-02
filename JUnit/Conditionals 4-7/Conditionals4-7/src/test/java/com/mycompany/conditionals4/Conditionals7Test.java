/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals4;

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
public class Conditionals7Test {

    public Conditionals7Test() {
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
     * Test of main method, of class Conditionals7.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals7.main(args);
    }

    /**
     * Test of nearHundred method, of class Conditionals7.
     */
    @Test
    public void test1NearHundred() {
        System.out.println("nearHundred");
        Conditionals7 instance = new Conditionals7();
        boolean result = instance.nearHundred(103);
        assertEquals(true, result);
    }

    @Test
    public void test2NearHundred() {
        System.out.println("nearHundred");
        Conditionals7 instance = new Conditionals7();
        boolean result = instance.nearHundred(90);
        assertEquals(true, result);
    }

    @Test
    public void test3NearHundred() {
        System.out.println("nearHundred");
        Conditionals7 instance = new Conditionals7();
        boolean result = instance.nearHundred(89);
        assertEquals(false, result);
    }

}
