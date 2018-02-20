/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productinventory.dto;

/**
 *
 * @author josephrohwer
 */
public abstract class Product {

    private String name;
    private int cost;
    private int stock;

    public Product(String name, int cost, int stock) {
        this.name = name;
        this.cost = cost;
        this.stock = stock;
    }

    public int getValue() {
        return (cost * stock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
