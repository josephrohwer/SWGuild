/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.methods;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mgaffney
 */
public class MathsTest {
    
    public MathsTest() {
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
     * Test of power method, of class Maths.
     */
    @org.junit.Test
    public void testPower() {
        System.out.println("power");
        int base = 0;
        int power = 0;
        Maths instance = new Maths();
        int expResult = 1;
        int result = instance.power(base, power);
        assertEquals(expResult, result);
        assertEquals(32, instance.power(2, 5));
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
