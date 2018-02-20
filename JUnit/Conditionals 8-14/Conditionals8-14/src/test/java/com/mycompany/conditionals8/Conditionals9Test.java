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
public class Conditionals9Test {

    public Conditionals9Test() {
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
     * Test of main method, of class Conditionals9.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conditionals9.main(args);
    }

    /**
     * Test of notString method, of class Conditionals9.
     */
    @Test
    public void test1NotString() {
        System.out.println("notString");
        Conditionals9 instance = new Conditionals9();
        String result = instance.notString("candy");
        assertEquals("not candy", result);
    }

    @Test
    public void test2NotString() {
        System.out.println("notString");
        Conditionals9 instance = new Conditionals9();
        String result = instance.notString("x");
        assertEquals("not x", result);
    }

    @Test
    public void test3NotString() {
        System.out.println("notString");
        Conditionals9 instance = new Conditionals9();
        String result = instance.notString("not bad");
        assertEquals("not bad", result);
    }

}
