/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays4;

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
public class Arrays6Test {

    public Arrays6Test() {
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
     * Test of main method, of class Arrays6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays6.main(args);
    }

    /**
     * Test of rotateLeft method, of class Arrays6.
     */
    @Test
    public void test1RotateLeft() {
        System.out.println("rotateLeft");
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 1};
        Arrays6 instance = new Arrays6();
        int[] result = instance.rotateLeft(a);
        assertArrayEquals(b, result);
    }

    @Test
    public void test2RotateLeft() {
        System.out.println("rotateLeft");
        int[] a = {5, 11, 9};
        int[] b = {11, 9, 5};
        Arrays6 instance = new Arrays6();
        int[] result = instance.rotateLeft(a);
        assertArrayEquals(b, result);
    }

    @Test
    public void test3RotateLeft() {
        System.out.println("rotateLeft");
        int[] a = {7, 0, 0};
        int[] b = {0, 0, 7};
        Arrays6 instance = new Arrays6();
        int[] result = instance.rotateLeft(a);
        assertArrayEquals(b, result);
    }

}
