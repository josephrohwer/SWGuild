/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dao;

import com.mycompany.flooringmasterybasic.dto.Order;
import com.mycompany.flooringmasterybasic.dto.Product;
import com.mycompany.flooringmasterybasic.dto.TaxRate;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author josephrohwer
 */
public class OrderDAOProd implements OrderDAO {

    private LocalDate finalDate;
    private List<Order> orders = new ArrayList<>();

    private final Map<String, List<Order>> orderLists;
    private final List<String> names;
    private final List<Product> productTypes;
    private final List<TaxRate> stateTaxRates;

    public OrderDAOProd() {
        productTypes = new ProductDAOProd().run();
        stateTaxRates = new TaxRateDAOProd().run();
        names = getFileNames();
        orderLists = loadFiles();
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

        try (PrintWriter out = new PrintWriter(new FileWriter("Data/Order_" + finalDate + ".txt"))) {
            orders.stream().forEach((add) -> {
                out.println(add.getOrderNumber()
                        + "," + add.customer
                        + "," + add.taxRate.getStateCode()
                        + "," + add.taxRate.getTaxRate()
                        + "," + add.productType.getType()
                        + "," + add.area
                        + "," + add.productType.getMaterialCostPerSquareFoot()
                        + "," + add.productType.getLaborCostPerSquareFoot()
                        + "," + add.getMaterialCost()
                        + "," + add.getLaborCost()
                        + "," + add.getTaxCost()
                        + "," + add.getTotalCost());
            });
            out.flush();
        } catch (IOException e) {
        }
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

    private Map<String, List<Order>> loadFiles() {
        Map<String, List<Order>> database = new HashMap<>();
        names.stream().forEach(fileName -> database.put(fileName, readFiletoList(fileName)));
        return database;
    }

    private void setList(LocalDate date) {
        finalDate = date;
        String fileName = ("Order_" + date + ".txt");

        List<Order> orderList = new ArrayList<>();

        if (orderLists.containsKey(fileName)) {
            orderList = orderLists.get(fileName);
        } else {
            orderLists.put(fileName, orderList);
            names.add(fileName);
            saveFileNames(names);
        }

        orders = orderList;
    }

    private List<String> getFileNames() {
        List<String> fileNames = new ArrayList<>();
        try (Scanner kb = new Scanner(new BufferedReader(new FileReader("Data/Orders.txt")))) {
            String temp;

            while (kb.hasNextLine()) {
                temp = kb.nextLine();
                fileNames.add(temp);
            }
        } catch (FileNotFoundException e) {
        }
        return fileNames;
    }

    private void saveFileNames(List<String> saveNames) {
        try (PrintWriter write = new PrintWriter(new FileWriter("Data/Orders.txt"))) {
            saveNames.stream().forEach(fileName -> write.println(fileName));
            write.flush();
            write.close();

        } catch (IOException e) {
            System.out.println("! Error Saving Order Lists Filename Data to File");
        }
    }

    private List<Order> readFiletoList(String fileName) {
        List<Order> ordersRead = new ArrayList<>();
        try (Scanner kb = new Scanner(new BufferedReader(new FileReader("Data/" + fileName)))) {
            String temp;
            String[] tempStrings;

            while (kb.hasNextLine()) {
                temp = kb.nextLine();
                tempStrings = temp.split(",");
                ordersRead.add(new Order(Integer.parseInt(tempStrings[0]), tempStrings[1], getTaxRate(tempStrings[2]),
                        getProduct(tempStrings[4]), Double.parseDouble(tempStrings[5])));
            }
        } catch (FileNotFoundException e) {
        }
        return ordersRead;
    }
}
