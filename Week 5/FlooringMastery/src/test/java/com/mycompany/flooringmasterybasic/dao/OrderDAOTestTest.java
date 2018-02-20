/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dao;

import com.mycompany.flooringmasterybasic.dto.Order;
import com.mycompany.flooringmasterybasic.dto.Product;
import com.mycompany.flooringmasterybasic.dto.TaxRate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
public class OrderDAOTestTest {
    
    OrderDAOTest instance = new OrderDAOTest();
    private List<Order> orders = new ArrayList<>();
    private LocalDate finalDate;

    public OrderDAOTestTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        finalDate = LocalDate.parse("1212-12-12");
        orders.add(new Order(1, "Joseph", instance.getTaxRate("OH"), instance.getProduct("Carpet"), 10));
        orders.add(new Order(2, "Alex", instance.getTaxRate("PA"), instance.getProduct("Laminate"), 25));
        orders.add(new Order(3, "Abrahm", instance.getTaxRate("MI"), instance.getProduct("Tile"), 50));
        orders.add(new Order(4, "John", instance.getTaxRate("IN"), instance.getProduct("Wood"), 100));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getOrders method, of class OrderDAOTest.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        List<Order> expResult = null;
        List<Order> result = instance.getOrders(finalDate);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getOrder method, of class OrderDAOTest.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        int orderNumber = 2;
        Order expResult = null;
        Order result = instance.getOrder(finalDate, orderNumber);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getHighestOrderNumber method, of class OrderDAOTest.
     */
    @Test
    public void testGetHighestOrderNumber() {
        System.out.println("getHighestOrderNumber");
        int result = instance.getHighestOrderNumber();
        assertEquals(5, result);
    }

    /**
     * Test of addOrder method, of class OrderDAOTest.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Order newOrder = new Order(5, "Jeff", instance.getTaxRate("MI"), instance.getProduct("Wood"), 200);
        instance.addOrder(finalDate, newOrder);
        assertEquals(4, orders.size());
    }

    /**
     * Test of editOrder method, of class OrderDAOTest.
     */
    @Test
    public void testEditOrder() {
        System.out.println("editOrder");
        Order oldOrder = instance.getOrder(finalDate, 1);
        Order updatedOrder = new Order(5, "Jake", instance.getTaxRate("OH"), instance.getProduct("Tile"), 50);
        instance.editOrder(oldOrder, updatedOrder);
        String result = instance.getOrder(finalDate, 5).getCustomer();
        assertEquals("Jake", result);
    }

    /**
     * Test of removeOrder method, of class OrderDAOTest.
     */
    @Test
    public void testRemoveOrder() {
        System.out.println("removeOrder");
        int orderNumber = 3;
        boolean result = instance.removeOrder(finalDate, orderNumber);
        assertEquals(true, result);
    }

}
