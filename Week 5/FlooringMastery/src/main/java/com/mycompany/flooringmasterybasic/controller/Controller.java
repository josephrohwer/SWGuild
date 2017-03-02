/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.controller;

import com.mycompany.flooringmasterybasic.dao.OrderDAO;
import com.mycompany.flooringmasterybasic.dto.Order;
import com.mycompany.flooringmasterybasic.ui.ConsoleIO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public class Controller {

    OrderDAO dao;
    ConsoleIO io;

    public Controller(OrderDAO dao) {
        this.dao = dao;
        io = new ConsoleIO();
    }

    public void run() {
        boolean keepRunning = true;

        do {
            String menuPrompt = "\n~~~~~~~FLOORING MASTERY~~~~~~~\n"
                    + "1.) Display Orders by Date\n"
                    + "2.) Add order\n"
                    + "3.) Remove order\n"
                    + "4.) Edit order\n"
                    + "5.) Save\n"
                    + "6.) Exit\n"
                    + "> ";

            int choice = io.readInteger(menuPrompt, 1, 6);
            switch (choice) {
                case 1:
                    displayOrders();
                    break;
                case 2:
                    addOrder();
                    break;
                case 3:
                    removeOrder();
                    break;
                case 4:
                    editOrder();
                    break;
                case 5:
                    save();
                    break;
                case 6:
                    io.write("\nGoodbye");
                    System.exit(0);
            }
        } while (keepRunning == true);
    }

    public void displayOrders() {
        LocalDate date = io.readDate("\nEnter the date of the order (yyyy-mm-dd): ");

        List<Order> orderTemp = new ArrayList<>(dao.getOrders(date));

        if (orderTemp.size() > 0) {
            io.write("Listing Orders...\n\n");
            for (Order o : orderTemp) {
                System.out.println(o);
            }
        } else {
            io.write("No orders for that date found. Returning to Main Menu\n");
            run();
        }
    }

    public void addOrder() {
        LocalDate date = io.readDate("\nEnter the date of the order (yyyy-mm-dd): ");
        String customerName = io.readString("Enter customer name: ");
        String stateName = io.readString("Enter the state name (OH, PA, MI, IN): ");
        String productType = io.readString("Enter the type of product (Carpet, Laminate, Tile, Wood): ");
        double area = io.readDouble("Enter the area to cover: ", 1, 100000);

        Order od = new Order(dao.getHighestOrderNumber(), customerName, dao.getTaxRate(stateName), dao.getProduct(productType), area);

        io.write("\n" + od);

        String choice = io.readString("\nReally Add? (y/n): ");
        if (choice.equals("y") || choice.equals("Y")) {
            dao.addOrder(date, od);
            io.readInteger("Order Added. Press 1 to go to Main Menu", 1, 1);
            run();
        } else {
            io.write("Order Not Added. Returning to Main Menu.\n");
            run();
        }
    }

    public void editOrder() {

        LocalDate date = io.readDate("\nEnter the date of the order (yyyy-mm-dd): ");
        int orderNumber = io.readInteger("Enter the order number: ", 1, 100000);

        Order oldOrder = dao.getOrder(date, orderNumber);

        if (oldOrder == null) {
            io.write("\nOrder not found! Returning to main menu\n");
            run();
        } else {
            String newCustomerName = io.readString("Enter customer name *" + oldOrder.getCustomer() + "*: ");
            newCustomerName = (newCustomerName.length() > 0) ? newCustomerName : oldOrder.getCustomer();

            String newStateName = io.readString("Enter the state name (OH, PA, MI, IN): *" + oldOrder.getTaxRate().getStateCode() + "*: ");
            newStateName = (newStateName.length() > 0) ? newStateName : oldOrder.getTaxRate().getStateCode();

            String newProductType = io.readString("Enter the type of product (Carpet, Laminate, Tile, Wood): *" + oldOrder.getProductType().getType() + "*: ");
            newProductType = (newProductType.length() > 0) ? newProductType : oldOrder.getProductType().getType();

            double newArea = io.readDouble("Enter the area to cover, enter '0' if you don't want to edit it: *" + oldOrder.getArea() + "*: ", 0, 100000);
            newArea = (newArea != 0) ? newArea : oldOrder.getArea();

            Order updatedOrder = new Order(dao.getHighestOrderNumber(), newCustomerName, dao.getTaxRate(newStateName), dao.getProduct(newProductType), newArea);
            dao.editOrder(oldOrder, updatedOrder);
        }
    }

    public void removeOrder() {
        LocalDate date = io.readDate("Enter the date of the order (yyyy-mm-dd): ");
        int orderNumber = io.readInteger("Enter the order number: ", 1, 100000);

        io.write("\n" + dao.getOrder(date, orderNumber));

        String choice = io.readString("\nReally Remove? (y/n): ");
        if (choice.equals("y") || choice.equals("Y")) {
            dao.removeOrder(date, orderNumber);
            io.readInteger("Order Removed. Press 1 to go to Main Menu", 1, 1);
            run();
        } else {
            io.write("Order Not Removed. Returning to Main Menu.\n");
            run();
        }
    }

    public void save() {
        dao.save();
        io.write("\nOrder(s) successfully saved.\n");
        run();
    }
}
