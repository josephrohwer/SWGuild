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
public class Conditionals8Test {

    public Conditionals8Test() {
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
     * Test of main method, of class Conditionals8.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals8.main(args);
    }

    /**
     * Test of posNeg method, of class Conditionals8.
     */
    @Test
    public void test1PosNeg() {
        System.out.println("posNeg");
        Conditionals8 instance = new Conditionals8();
        boolean result = instance.posNeg(1, -1, false);
        assertEquals(true, result);
    }

    @Test
    public void test2PosNeg() {
        System.out.println("posNeg");
        Conditionals8 instance = new Conditionals8();
        boolean result = instance.posNeg(-1, 1, false);
        assertEquals(true, result);
    }

    @Test
    public void test3PosNeg() {
        System.out.println("posNeg");
        Conditionals8 instance = new Conditionals8();
        boolean result = instance.posNeg(-4, -5, true);
        assertEquals(true, result);
    }

}
