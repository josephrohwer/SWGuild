/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dto;

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
public class TaxRateTest {
    
    private static final double DELTA = 1e-15;
    
    public TaxRateTest() {
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
     * Test of getStateCode method, of class TaxRate.
     */
    @Test
    public void testGetStateCode() {
        System.out.println("getStateCode");
        String state = "OH";
        double taxRate = 6.25;
        TaxRate instance = new TaxRate(state, taxRate);
        String result = instance.getStateCode();
        assertEquals("OH", result);
    }

    /**
     * Test of getTaxRate method, of class TaxRate.
     */
    @Test
    public void testGetTaxRate() {
        System.out.println("getTaxRate");
        String state = "OH";
        double taxRate = 6.25;
        TaxRate instance = new TaxRate(state, taxRate);
        double result = instance.getTaxRate();
        assertEquals(.0625, result, DELTA);
    }  
}
