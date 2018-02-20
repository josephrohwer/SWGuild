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
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public interface OrderDAO {

    Product getProduct(String productName);
    
    List<String> getProductTypes();
    
    TaxRate getTaxRate(String stateCode);
    
    List<String> getStateCodes();
    
    void save();
    
    List<Order> getOrders(LocalDate date); 
    
    Order getOrder(LocalDate date, int orderNumber);
    
    int getHighestOrderNumber();
    
    void addOrder(LocalDate date, Order newOrder);
    
    void editOrder(Order oldOrder, Order updatedOrder);
    
    boolean removeOrder(LocalDate date, int orderNumber);
}
