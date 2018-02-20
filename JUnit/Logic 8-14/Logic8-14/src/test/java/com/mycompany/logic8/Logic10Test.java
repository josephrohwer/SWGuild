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
public class Logic10Test {

    public Logic10Test() {
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
     * Test of main method, of class Logic10.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic10.main(args);
    }

    /**
     * Test of mod20 method, of class Logic10.
     */
    @Test
    public void test1Mod20() {
        System.out.println("mod20");
        Logic10 instance = new Logic10();
        boolean result = instance.mod20(20);
        assertEquals(false, result);
    }

    @Test
    public void test2Mod20() {
        System.out.println("mod20");
        Logic10 instance = new Logic10();
        boolean result = instance.mod20(21);
        assertEquals(true, result);
    }

    @Test
    public void test3Mod20() {
        System.out.println("mod20");
        Logic10 instance = new Logic10();
        boolean result = instance.mod20(22);
        assertEquals(true, result);
    }

}
