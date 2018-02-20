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
public class Logic11Test {

    public Logic11Test() {
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
     * Test of main method, of class Logic11.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic11.main(args);
    }

    /**
     * Test of mod35 method, of class Logic11.
     */
    @Test
    public void test1Mod35() {
        System.out.println("mod35");
        Logic11 instance = new Logic11();
        boolean result = instance.mod35(3);
        assertEquals(true, result);
    }

    @Test
    public void test2Mod35() {
        System.out.println("mod35");
        Logic11 instance = new Logic11();
        boolean result = instance.mod35(10);
        assertEquals(true, result);
    }

    @Test
    public void test3Mod35() {
        System.out.println("mod35");
        Logic11 instance = new Logic11();
        boolean result = instance.mod35(15);
        assertEquals(false, result);
    }

}
