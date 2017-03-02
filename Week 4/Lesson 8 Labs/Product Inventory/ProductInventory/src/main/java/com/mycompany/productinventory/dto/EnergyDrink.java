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
public class EnergyDrink extends Product {

    private String caffeine;

    @Override
    public String toString() {
        String itemTemp = (getName() + " " + getCaffeine() + " " + "$" + getCost() + " - " + getStock());
        return itemTemp;
    }

    public EnergyDrink(String name, String caffeine, int cost, int stock) {
        super(name, cost, stock);
        this.caffeine = caffeine;
    }

    public String getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(String ounces) {
        this.caffeine = ounces;
    }
}
