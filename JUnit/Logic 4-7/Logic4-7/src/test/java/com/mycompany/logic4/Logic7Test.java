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
public class Logic7Test {

    public Logic7Test() {
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
     * Test of main method, of class Logic7.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic7.main(args);
    }

    /**
     * Test of loveSix method, of class Logic7.
     */
    @Test
    public void test1LoveSix() {
        System.out.println("loveSix");
        Logic7 instance = new Logic7();
        boolean result = instance.loveSix(6, 4);
        assertEquals(true, result);
    }

    @Test
    public void test2LoveSix() {
        System.out.println("loveSix");
        Logic7 instance = new Logic7();
        boolean result = instance.loveSix(4, 5);
        assertEquals(false, result);
    }

    @Test
    public void test3LoveSix() {
        System.out.println("loveSix");
        Logic7 instance = new Logic7();
        boolean result = instance.loveSix(1, 5);
        assertEquals(true, result);
    }
}
