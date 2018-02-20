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
public class Chip extends Product {

    private String size;

    @Override
    public String toString() {
        String itemTemp = (getName() + " " + getSize() + " " + "$" + getCost() + " - " + getStock());
        return itemTemp;
    }

    public Chip(String name, String size, int cost, int stock) {
        super(name, cost, stock);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
