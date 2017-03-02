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
public class CandyBar extends Product {

    private String flavor;
    
        @Override
    public String toString() {
        String itemTemp = (getName() + " " + getFlavor() + " " + "$" + getCost() + " - " + getStock());
        return itemTemp;
    }

    public CandyBar(String name, String flavor, int cost, int stock) {
        super(name, cost, stock);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
