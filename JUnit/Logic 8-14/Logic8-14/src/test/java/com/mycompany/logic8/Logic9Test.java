/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic8;

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
public class Logic9Test {

    public Logic9Test() {
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
     * Test of main method, of class Logic9.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic9.main(args);
    }

    /**
     * Test of specialEleven method, of class Logic9.
     */
    @Test
    public void test1SpecialEleven() {
        System.out.println("specialEleven");
        Logic9 instance = new Logic9();
        boolean result = instance.specialEleven(22);
        assertEquals(true, result);
    }

    @Test
    public void test2SpecialEleven() {
        System.out.println("specialEleven");
        Logic9 instance = new Logic9();
        boolean result = instance.specialEleven(23);
        assertEquals(true, result);
    }

    @Test
    public void test3SpecialEleven() {
        System.out.println("specialEleven");
        Logic9 instance = new Logic9();
        boolean result = instance.specialEleven(24);
        assertEquals(false, result);
    }

}
