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
public class Loops9Test {

    public Loops9Test() {
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
     * Test of main method, of class Loops9.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops9.main(args);
    }

    /**
     * Test of arrayFront9 method, of class Loops9.
     */
    @Test
    public void test1ArrayFront9() {
        System.out.println("arrayFront9");
        int[] numbers = {1, 2, 9, 3, 4};
        Loops9 instance = new Loops9();
        boolean result = instance.arrayFront9(numbers);
        assertEquals(true, result);
    }

    @Test
    public void test2ArrayFront9() {
        System.out.println("arrayFront9");
        int[] numbers = {1, 2, 3, 4, 9};
        Loops9 instance = new Loops9();
        boolean result = instance.arrayFront9(numbers);
        assertEquals(false, result);
    }

    @Test
    public void test3ArrayFront9() {
        System.out.println("arrayFront9");
        int[] numbers = {1, 2, 3, 4, 5};
        Loops9 instance = new Loops9();
        boolean result = instance.arrayFront9(numbers);
        assertEquals(false, result);
    }

}
