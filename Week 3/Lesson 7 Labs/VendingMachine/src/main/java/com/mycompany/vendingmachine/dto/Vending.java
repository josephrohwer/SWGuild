/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dto;

/**
 *
 * @author apprentice
 */
public class Vending {

    private String name;
    private String cost;
    private int inventory;

    public String toString() {
            String itemTemp = (getName() + "    " + getCost() + " - " + getInventory());
            return itemTemp;
    }

    public Vending(String name, String cost, int inventory) {
        this.name = name;
        this.cost = cost;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
