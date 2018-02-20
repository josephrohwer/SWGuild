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
public class Conditionals11Test {

    public Conditionals11Test() {
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
     * Test of main method, of class Conditionals11.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals11.main(args);
    }

    /**
     * Test of frontBack method, of class Conditionals11.
     */
    @Test
    public void test1FrontBack() {
        System.out.println("frontBack");
        Conditionals11 instance = new Conditionals11();
        String result = instance.frontBack("code");
        assertEquals("eodc", result);
    }

    @Test
    public void test2FrontBack() {
        System.out.println("frontBack");
        Conditionals11 instance = new Conditionals11();
        String result = instance.frontBack("a");
        assertEquals("a", result);
    }

    @Test
    public void test3FrontBack() {
        System.out.println("frontBack");
        Conditionals11 instance = new Conditionals11();
        String result = instance.frontBack("ab");
        assertEquals("ba", result);
    }
}
