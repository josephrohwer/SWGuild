/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strings8;

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
public class Strings13Test {

    public Strings13Test() {
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
     * Test of main method, of class Strings13.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings13.main(args);
    }

    /**
     * Test of endsWithLy method, of class Strings13.
     */
    @Test
    public void test1EndsWithLy() {
        System.out.println("endsWithLy");
        Strings13 instance = new Strings13();
        boolean result = instance.endsWithLy("oddly");
        assertEquals(true, result);
    }

    @Test
    public void test2EndsWithLy() {
        System.out.println("endsWithLy");
        Strings13 instance = new Strings13();
        boolean result = instance.endsWithLy("y");
        assertEquals(false, result);
    }

    @Test
    public void test3EndsWithLy() {
        System.out.println("endsWithLy");
        Strings13 instance = new Strings13();
        boolean result = instance.endsWithLy("oddy");
        assertEquals(false, result);
    }

}
