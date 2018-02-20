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
public class Loops8Test {

    public Loops8Test() {
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
     * Test of main method, of class Loops8.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops8.main(args);
    }

    /**
     * Test of count9 method, of class Loops8.
     */
    @Test
    public void test1Count9() {
        System.out.println("count9");
        int[] numbers = {1, 2, 9};
        Loops8 instance = new Loops8();
        int result = instance.count9(numbers);
        assertEquals(1, result);
    }

    @Test
    public void test2Count9() {
        System.out.println("count9");
        int[] numbers = {1, 9, 9};
        Loops8 instance = new Loops8();
        int result = instance.count9(numbers);
        assertEquals(2, result);
    }

    @Test
    public void test3Count9() {
        System.out.println("count9");
        int[] numbers = {1, 9, 9, 3, 9};
        Loops8 instance = new Loops8();
        int result = instance.count9(numbers);
        assertEquals(3, result);
    }
}
