/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.junit;

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
public class JUnitExampleTest {
    
    public JUnitExampleTest() {
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
     * Test of method1 method, of class JUnitExample.
     */
    @Test
    public void testMethod1() {
        System.out.println("method1");
        String s = "";
        JUnitExample instance = new JUnitExample();
        String expResult = "";
        String result = instance.method1("aBaBB");
        assertEquals("ABABb", result);
        result = instance.method1("Hello");
        assertEquals("HELLo", result);
        result = instance.method1("worlD");
        assertEquals("WORLd", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
