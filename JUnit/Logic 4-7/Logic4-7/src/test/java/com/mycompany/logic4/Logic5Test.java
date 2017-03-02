/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic4;

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
public class Logic5Test {

    public Logic5Test() {
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
     * Test of main method, of class Logic5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic5.main(args);
    }

    /**
     * Test of skipSum method, of class Logic5.
     */
    @Test
    public void test1skipSum() {
        System.out.println("skipSum");
        Logic5 instance = new Logic5();
        int result = instance.skipSum(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void test2skipSum() {
        System.out.println("skipSum");
        Logic5 instance = new Logic5();
        int result = instance.skipSum(9, 4);
        assertEquals(20, result);
    }

    @Test
    public void test3skipSum() {
        System.out.println("skipSum");
        Logic5 instance = new Logic5();
        int result = instance.skipSum(10, 11);
        assertEquals(21, result);
    }
}
