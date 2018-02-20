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
public class Conditionals5Test {

    public Conditionals5Test() {
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
     * Test of main method, of class Conditionals5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals5.main(args);
    }

    /**
     * Test of parrotTrouble method, of class Conditionals5.
     */
    @Test
    public void test1ParrotTrouble() {
        System.out.println("parrotTrouble");
        Conditionals5 instance = new Conditionals5();
        boolean result = instance.parrotTrouble(true, 6);
        assertEquals(true, result);
    }

    @Test
    public void test2ParrotTrouble() {
        System.out.println("parrotTrouble");
        Conditionals5 instance = new Conditionals5();
        boolean result = instance.parrotTrouble(true, 7);
        assertEquals(false, result);
    }

    @Test
    public void test3ParrotTrouble() {
        System.out.println("parrotTrouble");
        Conditionals5 instance = new Conditionals5();
        boolean result = instance.parrotTrouble(false, 6);
        assertEquals(false, result);
    }
}
