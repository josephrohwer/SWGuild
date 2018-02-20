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
public class Conditionals12Test {

    public Conditionals12Test() {
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
     * Test of main method, of class Conditionals12.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals12.main(args);
    }

    /**
     * Test of front3 method, of class Conditionals12.
     */
    @Test
    public void test1Front3() {
        System.out.println("front3");
        Conditionals12 instance = new Conditionals12();
        String result = instance.front3("microsoft");
        assertEquals("micmicmic", result);
    }

    @Test
    public void test2Front3() {
        System.out.println("front3");
        Conditionals12 instance = new Conditionals12();
        String result = instance.front3("chocolate");
        assertEquals("chochocho", result);
    }

    @Test
    public void test3Front3() {
        System.out.println("front3");
        Conditionals12 instance = new Conditionals12();
        String result = instance.front3("at");
        assertEquals("atatat", result);
    }

}
