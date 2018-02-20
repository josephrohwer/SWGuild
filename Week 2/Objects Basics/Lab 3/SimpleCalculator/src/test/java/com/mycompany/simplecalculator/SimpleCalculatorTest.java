/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculator;

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
public class SimpleCalculatorTest {
    
    public SimpleCalculatorTest() {
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
     * Test of Addition method, of class SimpleCalculator.
     */
    private static final float DELTA = .01f;
    
    @Test
    public void testAddition() {
        System.out.println("Addition");
        SimpleCalculator instance = new SimpleCalculator();
        float result = instance.Addition(10, 13);
        assertEquals(23.0, result, DELTA);
    }

    /**
     * Test of Subtraction method, of class SimpleCalculator.
     */
    @Test
    public void testSubtraction() {       
        System.out.println("Subtraction");
        SimpleCalculator instance = new SimpleCalculator();
        float result = instance.Subtraction(10, 13);
        assertEquals(-3.0, result, DELTA);
    }

    /**
     * Test of Multiplication method, of class SimpleCalculator.
     */
    @Test
    public void testMultiplication() {
        System.out.println("Multiplication");
        SimpleCalculator instance = new SimpleCalculator();
        float result = instance.Multiplication(4, 4);
        assertEquals(16.0, result, DELTA);
    }

    /**
     * Test of Division method, of class SimpleCalculator.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        SimpleCalculator instance = new SimpleCalculator();
        float result = instance.Division(20, 10);
        assertEquals(2.0, result, DELTA);
    }
    
}
