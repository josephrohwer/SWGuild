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
public class Conditionals14Test {

    public Conditionals14Test() {
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
     * Test of main method, of class Conditionals14.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals14.main(args);
    }

    /**
     * Test of multiple3or5 method, of class Conditionals14.
     */
    @Test
    public void test1Multiple3or5() {
        System.out.println("multiple3or5");
        Conditionals14 instance = new Conditionals14();
        boolean result = instance.multiple3or5(3);
        assertEquals(true, result);
    }

    @Test
    public void test2Multiple3or5() {
        System.out.println("multiple3or5");
        Conditionals14 instance = new Conditionals14();
        boolean result = instance.multiple3or5(10);
        assertEquals(true, result);
    }

    @Test
    public void test3Multiple3or5() {
        System.out.println("multiple3or5");
        Conditionals14 instance = new Conditionals14();
        boolean result = instance.multiple3or5(8);
        assertEquals(false, result);
    }

}
