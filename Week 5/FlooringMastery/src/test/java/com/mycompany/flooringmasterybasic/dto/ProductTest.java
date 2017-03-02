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
public class ProductTest {

    private static final double DELTA = 1e-15;

    public ProductTest() {
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
     * Test of getType method, of class Product.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        String type = "Carpet";
        double materialCostPerSquareFoot = 2.25;
        double laborCostPerSquareFoot = 2.10;
        Product instance = new Product(type, materialCostPerSquareFoot, laborCostPerSquareFoot);
        String result = instance.getType();
        assertEquals("Carpet", result);
    }

    /**
     * Test of getMaterialCostPerSquareFoot method, of class Product.
     */
    @Test
    public void testGetMaterialCostPerSquareFoot() {
        System.out.println("getMaterialCostPerSquareFoot");
        String type = "Carpet";
        double materialCostPerSquareFoot = 2.25;
        double laborCostPerSquareFoot = 2.10;
        Product instance = new Product(type, materialCostPerSquareFoot, laborCostPerSquareFoot);
        double result = instance.getMaterialCostPerSquareFoot();
        assertEquals(2.25, result, DELTA);
    }

    /**
     * Test of getLaborCostPerSquareFoot method, of class Product.
     */
    @Test
    public void testGetLaborCostPerSquareFoot() {
        System.out.println("getLaborCostPerSquareFoot");
        String type = "Carpet";
        double materialCostPerSquareFoot = 2.25;
        double laborCostPerSquareFoot = 2.10;
        Product instance = new Product(type, materialCostPerSquareFoot, laborCostPerSquareFoot);
        double result = instance.getLaborCostPerSquareFoot();
        assertEquals(2.10, result, DELTA);
    }

}
