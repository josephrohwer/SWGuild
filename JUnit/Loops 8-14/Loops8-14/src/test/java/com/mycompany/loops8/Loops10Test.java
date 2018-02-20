/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops8;

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
public class Loops10Test {

    public Loops10Test() {
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
     * Test of main method, of class Loops10.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops10.main(args);
    }

    /**
     * Test of array123 method, of class Loops10.
     */
    @Test
    public void test1Array123() {
        System.out.println("array123");
        int[] numbers = {1, 1, 2, 3, 1};
        Loops10 instance = new Loops10();
        boolean result = instance.array123(numbers);
        assertEquals(true, result);
    }

    @Test
    public void test2Array123() {
        System.out.println("array123");
        int[] numbers = {1, 1, 2, 4, 1};
        Loops10 instance = new Loops10();
        boolean result = instance.array123(numbers);
        assertEquals(false, result);
    }

    @Test
    public void test3Array123() {
        System.out.println("array123");
        int[] numbers = {1, 1, 2, 1, 2, 3};
        Loops10 instance = new Loops10();
        boolean result = instance.array123(numbers);
        assertEquals(true, result);
    }

}
