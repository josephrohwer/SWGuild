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
public class Conditionals4Test {

    public Conditionals4Test() {
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
     * Test of main method, of class Conditionals4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals4.main(args);
    }

    /**
     * Test of diff21 method, of class Conditionals4.
     */
    @Test
    public void test1Diff21() {
        System.out.println("diff21");
        Conditionals4 instance = new Conditionals4();
        int result = instance.diff21(23);
        assertEquals(4, result);
    }

    @Test
    public void test2Diff21() {
        System.out.println("diff21");
        Conditionals4 instance = new Conditionals4();
        int result = instance.diff21(10);
        assertEquals(11, result);
    }

    @Test
    public void test3Diff21() {
        System.out.println("diff21");
        Conditionals4 instance = new Conditionals4();
        int result = instance.diff21(21);
        assertEquals(0, result);
    }

}
