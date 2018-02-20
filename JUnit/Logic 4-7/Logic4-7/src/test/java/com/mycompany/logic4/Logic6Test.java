/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic4;

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
public class Logic6Test {

    public Logic6Test() {
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
     * Test of main method, of class Logic6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic6.main(args);
    }

    /**
     * Test of alarmClock method, of class Logic6.
     */
    @Test
    public void test1AlarmClock() {
        System.out.println("alarmClock");
        Logic6 instance = new Logic6();
        String result = instance.alarmClock(1, false);
        assertEquals("7:00", result);
    }

    @Test
    public void test2AlarmClock() {
        System.out.println("alarmClock");
        Logic6 instance = new Logic6();
        String result = instance.alarmClock(5, false);
        assertEquals("7:00", result);
    }

    @Test
    public void test3AlarmClock() {
        System.out.println("alarmClock");
        Logic6 instance = new Logic6();
        String result = instance.alarmClock(0, false);
        assertEquals("10:00", result);
    }

}
