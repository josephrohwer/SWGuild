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
public class Logic4Test {

    public Logic4Test() {
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
     * Test of main method, of class Logic4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic4.main(args);
    }

    /**
     * Test of caughtSpeeding method, of class Logic4.
     */
    @Test
    public void test1CaughtSpeeding() {
        System.out.println("caughtSpeeding");
        Logic4 instance = new Logic4();
        int result = instance.caughtSpeeding(65, true);
        assertEquals(0, result);
    }

    @Test
    public void test2CaughtSpeeding() {
        System.out.println("caughtSpeeding2");
        Logic4 instance = new Logic4();
        int result = instance.caughtSpeeding(65, false);
        assertEquals(1, result);
    }

    @Test
    public void test3CaughtSpeeding() {
        System.out.println("caughtSpeeding");
        Logic4 instance = new Logic4();
        int result = instance.caughtSpeeding(60, false);
        assertEquals(0, result);
    }
}
