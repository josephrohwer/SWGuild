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
public class Logic12Test {

    public Logic12Test() {
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
     * Test of main method, of class Logic12.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logic12.main(args);
    }

    /**
     * Test of answerCell method, of class Logic12.
     */
    @Test
    public void test1AnswerCell() {
        System.out.println("answerCell");
        Logic12 instance = new Logic12();
        boolean result = instance.answerCell(false, false, false);
        assertEquals(true, result);
    }

    @Test
    public void test2AnswerCell() {
        System.out.println("answerCell");
        Logic12 instance = new Logic12();
        boolean result = instance.answerCell(false, false, true);
        assertEquals(false, result);
    }

    @Test
    public void test3AnswerCell() {
        System.out.println("answerCell");
        Logic12 instance = new Logic12();
        boolean result = instance.answerCell(true, false, false);
        assertEquals(false, result);
    }

}
