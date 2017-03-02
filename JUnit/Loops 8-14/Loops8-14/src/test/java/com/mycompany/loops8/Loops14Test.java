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
 * @author josephrohwer
 */
public class Loops14Test {

    public Loops14Test() {
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
     * Test of main method, of class Loops14.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loops14.main(args);
    }

    /**
     * Test of doNotYak method, of class Loops14.
     */
    @Test
    public void test1DoNotYak() {
        System.out.println("doNotYak");
        String str = "";
        Loops14 instance = new Loops14();
        String result = instance.doNotYak("yakpak");
        assertEquals("pak", result);
    }

    @Test
    public void test2DoNotYak() {
        System.out.println("doNotYak");
        String str = "";
        Loops14 instance = new Loops14();
        String result = instance.doNotYak("pakyak");
        assertEquals("pak", result);
    }

    @Test
    public void test3DoNotYak() {
        System.out.println("doNotYak");
        String str = "";
        Loops14 instance = new Loops14();
        String result = instance.doNotYak("yak123ya");
        assertEquals("123ya", result);
    }

}
