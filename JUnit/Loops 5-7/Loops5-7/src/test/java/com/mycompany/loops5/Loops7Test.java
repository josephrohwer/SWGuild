/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops5;

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
public class Loops7Test {

    public Loops7Test() {
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
     * Test of main method, of class Loops7.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops7.main(args);
    }

    /**
     * Test of countLast2 method, of class Loops7.
     */
    @Test
    public void test1CountLast2() {
        System.out.println("last2");
        Loops7 instance = new Loops7();
        int result = instance.countLast2("hixxhi");
        assertEquals(1, result);
    }

    @Test
    public void test2CountLast2() {
        System.out.println("last2");
        Loops7 instance = new Loops7();
        int result = instance.countLast2("xaxxaxaxx");
        assertEquals(1, result);
    }

    @Test
    public void test3CountLast2() {
        System.out.println("last2");
        Loops7 instance = new Loops7();
        int result = instance.countLast2("axxxaaxx");
        assertEquals(2, result);
    }

}
