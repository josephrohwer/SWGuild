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
public class Loops11Test {

    public Loops11Test() {
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
     * Test of main method, of class Loops11.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops11.main(args);
    }

    /**
     * Test of subStringMatch method, of class Loops11.
     */
    @Test
    public void test1SubStringMatch() {
        System.out.println("subStringMatch");
        Loops11 instance = new Loops11();
        int result = instance.subStringMatch("xxcaazz", "xxbaaz");
        assertEquals(3, result);
    }

    @Test
    public void test2SubStringMatch() {
        System.out.println("subStringMatch");
        Loops11 instance = new Loops11();
        int result = instance.subStringMatch("abc", "abc");
        assertEquals(2, result);
    }

    @Test
    public void test3SubStringMatch() {
        System.out.println("subStringMatch");
        Loops11 instance = new Loops11();
        int result = instance.subStringMatch("abc", "axc");
        assertEquals(0, result);
    }

}
