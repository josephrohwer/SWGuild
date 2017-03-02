/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dao;

import com.mycompany.flooringmasterybasic.dto.Order;
import com.mycompany.flooringmasterybasic.dto.Product;
import com.mycompany.flooringmasterybasic.dto.TaxRate;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author josephrohwer
 */
public class OrderDAOTest implements OrderDAO {

    private LocalDate finalDate;
    private List<Order> orders = new ArrayList<>();

    private final Map<String, List<Order>> orderLists;
    private final List<Product> productTypes;
    private final List<TaxRate> stateTaxRates;

    public OrderDAOTest() {
        productTypes = new ProductDAOProd().run();
        stateTaxRates = new TaxRateDAOProd().run();
        orderLists = new HashMap<>();
        addOrdersToList();
    }

    private void addOrdersToList() {
        finalDate = LocalDate.parse("1212-12-12");
        orders.add(new Order(1, "Joseph", getTaxRate("OH"), getProduct("Carpet"), 10));
        orders.add(new Order(2, "Alex", getTaxRate("PA"), getProduct("Laminate"), 25));
        orders.add(new Order(3, "Abrahm", getTaxRate("MI"), getProduct("Tile"), 50));
        orders.add(new Order(4, "John", getTaxRate("IN"), getProduct("Wood"), 100));
        save();
    }

    @Override
    public Product getProduct(String productName) {
        return productTypes.stream()
                .filter(p -> p.getType().equalsIgnoreCase(productName))
                .findFirst()
                .get();

    }

    @Override
    public List<String> getProductTypes() {
        return productTypes.stream().map(p -> p.getType()).collect(Collectors.toList());

    }

    @Override
    public TaxRate getTaxRate(String stateCode) {
        return stateTaxRates.stream()
                .filter(tax -> tax.getStateCode().equalsIgnoreCase(stateCode))
                .findFirst()
                .get();
    }

    @Override
    public List<String> getStateCodes() {
        return stateTaxRates.stream().map(p -> p.getStateCode()).collect(Collectors.toList());
    }

    @Override
    public void save() {
        orderLists.put(("Order_" + finalDate + ".txt"), orders);
    }

    @Override
    public List<Order> getOrders(LocalDate date) {
        setList(date);
        List<Order> displayOrders = new ArrayList<>(orders);
        return displayOrders;
    }

    @Override
    public Order getOrder(LocalDate date, int orderNumber) {
        setList(date);
        List<Order> tempOrders = new ArrayList<>(orders);

        for (Order d : tempOrders) {
            if (d.getOrderNumber() == orderNumber) {
                return d;
            }
        }
        return null;
    }

    @Override
    public int getHighestOrderNumber() {
        int highestNumber = orders.size() + 1;
        return highestNumber;
    }

    @Override
    public void addOrder(LocalDate date, Order newOrder) {
        setList(date);
        orders.add(newOrder);
        save();
    }

    @Override
    public void editOrder(Order oldOrder, Order updatedOrder) {
        orders.set(orders.indexOf(oldOrder), updatedOrder);
        save();
    }

    @Override
    public boolean removeOrder(LocalDate date, int orderNumber) {
        setList(date);
        boolean isRemoved = orders.removeIf(order -> order.getOrderNumber() == orderNumber);
        save();
        return isRemoved;
    }

    private void setList(LocalDate date) {
        finalDate = date;
        String fileName = ("Order_" + date + ".txt");
        List<Order> orderList = new ArrayList<>();
        if (orderLists.containsKey(fileName)) {
            orderList = orderLists.get(fileName);
        } else {
            orderLists.put(fileName, orderList);
        }
        orders = orderList;
    }
}
