/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic8;

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
public class Logic8Test {

    public Logic8Test() {
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
     * Test of main method, of class Logic8.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic8.main(args);
    }

    /**
     * Test of inRange method, of class Logic8.
     */
    @Test
    public void test1InRange() {
        System.out.println("inRange");
        Logic8 instance = new Logic8();
        boolean result = instance.inRange(5, false);
        assertEquals(true, result);
    }

    @Test
    public void test2InRange() {
        System.out.println("inRange");
        Logic8 instance = new Logic8();
        boolean result = instance.inRange(11, false);
        assertEquals(false, result);
    }

    @Test
    public void test3InRange() {
        System.out.println("inRange");
        Logic8 instance = new Logic8();
        boolean result = instance.inRange(11, true);
        assertEquals(true, result);
    }
}
