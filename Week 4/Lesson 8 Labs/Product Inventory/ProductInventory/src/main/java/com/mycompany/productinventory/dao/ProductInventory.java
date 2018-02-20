/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productinventory.dao;

import com.mycompany.productinventory.dto.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public class ProductInventory {

    private ArrayList<Product> products = new ArrayList<>();

    public List<Product> listProducts() {
        List<Product> productTemp = new ArrayList<>();

        products.stream().forEach((p) -> {
            productTemp.add(p);
        });
        return productTemp;
    }

    public void addProduct(Product pd) {
        products.add(pd);
    }

    public void addStock(int choice) {
        int a = products.get(choice - 1).getStock();
        a = (a + 1);
        products.get(choice - 1).setStock(a);
    }

    public void removeStock(int choice) {
        int a = products.get(choice - 1).getStock();
        a = (a - 1);
        products.get(choice - 1).setStock(a);
    }

    public int totalValueProduct(int choice) {

        if (choice == 1) {
            int value = products.get(choice - 1).getValue();
            return value;
        } else if (choice == 2) {
            int value2 = products.get(choice - 1).getValue();
            return value2;
        } else if (choice == 2) {
            int value3 = products.get(choice - 1).getValue();
            return value3;
        } else {
            return 0;
        }
    }

    public int totalValueInventory() {
        int value1 = products.get(0).getValue();
        int value2 = products.get(1).getValue();
        int value3 = products.get(2).getValue();
        int finalValue = (value1 + value2 + value3);
        return finalValue;
    }
}
