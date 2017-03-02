/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productinventory.controller;

import com.mycompany.productinventory.dao.ProductInventory;
import com.mycompany.productinventory.dto.CandyBar;
import com.mycompany.productinventory.dto.Chip;
import com.mycompany.productinventory.dto.EnergyDrink;
import com.mycompany.productinventory.dto.Product;
import com.mycompany.productinventory.ui.ConsoleIO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public class Controller {

    private final ConsoleIO io = new ConsoleIO();
    private final ProductInventory pi = new ProductInventory();

    public void run() {
        boolean isRunning = true;
        do {
            int choice = io.readInteger("\nPlease select the operation you wish to perform:\n"
                    + "     1. List Products\n"
                    + "     2. Add Product\n"
                    + "     3. Add Stock\n"
                    + "     4. Remove Stock\n"
                    + "     5. Total Value of Product\n"
                    + "     6. Total Value of All Products\n"
                    + "     7. Exit\n"
                    + "> ", 1, 7);

            switch (choice) {
                case 1:
                    listProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    addStock();
                    break;
                case 4:
                    removeStock();
                    break;
                case 5:
                    totalValueProduct();
                    break;
                case 6:
                    totalValueInventory();
                    break;
                case 7:
                    System.out.println("\nGoodbye.");
                    System.exit(0);
            }
        } while (isRunning == true);
    }

    public void listProducts() {
        io.write("\n");
        List<Product> productTemp = new ArrayList<>(pi.listProducts());
        for (int i = 1; i <= productTemp.size(); i++) {
            System.out.println(productTemp.get(i - 1));
        }
    }

    public void addProduct() {
        int choice = io.readInteger("\nWhat type of product would you like to add?:\n"
                + "     1. Energy Drink\n"
                + "     2. Chip\n"
                + "     3. Candy Bar\n"
                + "     4. Return to Main Menu\n"
                + "> ", 1, 4);

        switch (choice) {
            case 1:
                String name = io.readString("\nName of energy drink: ");
                String caffeine = io.readString("Caffeine or caffeine free?: ");
                int cost = io.readInteger("Cost of energy drink: ", 1, 100);
                int stock = io.readInteger("Amount to add: ", 1, 1000);

                Product products = new EnergyDrink(name, caffeine, cost, stock);
                pi.addProduct(products);
                io.write("Energy Drink successfully added. Returning to main menu.\n");
                break;
            case 2:
                String name2 = io.readString("\nName of chip: ");
                String size = io.readString("Large, medium, or small bag?: ");
                int cost2 = io.readInteger("Cost of chip: ", 1, 100);
                int stock2 = io.readInteger("Amount to add: ", 1, 1000);

                Product products2 = new Chip(name2, size, cost2, stock2);
                pi.addProduct(products2);
                io.write("Chip successfully added. Returning to main menu.\n");
                break;
            case 3:
                String name3 = io.readString("\nName of candy bar: ");
                String flavor = io.readString("What flavor is it?: ");
                int cost3 = io.readInteger("Cost of candy bar: ", 1, 100);
                int stock3 = io.readInteger("Amount to add: ", 1, 1000);

                Product products3 = new CandyBar(name3, flavor, cost3, stock3);
                pi.addProduct(products3);
                io.write("\nCandy bar successfully added. Returning to main menu.\n");
                break;
            case 4:
                break;
        }
    }

    public void addStock() {
        int choice = io.readInteger("\nAdd 1 stock to which product?:\n"
                + "    1. Energy Drinks\n"
                + "    2. Chips\n"
                + "    3. Candy Bars\n"
                + "> ", 1, 3);
        io.write("\nStock updated\n");
        pi.addStock(choice);
    }

    public void removeStock() {
        int choice = io.readInteger("\nRemove 1 stock from which product?:\n"
                + "    1. Energy Drinks\n"
                + "    2. Chips\n"
                + "    3. Candy Bars\n"
                + "> ", 1, 3);
        io.write("\nStock updated\n");
        pi.removeStock(choice);
    }

    public void totalValueProduct() {
        int choice = io.readInteger("\nTotal value of which product?:\n"
                + "    1. Energy Drinks\n"
                + "    2. Chips\n"
                + "    3. Candy Bars\n"
                + "> ", 1, 3);
        io.write("Value: $" + pi.totalValueProduct(choice) + "\n");
    }

    public void totalValueInventory() {
        io.write("\nTotal Value: $" + pi.totalValueInventory() + "\n");
    }
}
