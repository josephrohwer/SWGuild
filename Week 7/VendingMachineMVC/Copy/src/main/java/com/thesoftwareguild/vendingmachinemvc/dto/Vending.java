/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.vendingmachinemvc.dto;

import java.util.Objects;

/**
 *
 * @author josephrohwer
 */
public class Vending {

    private int VendingId;

    private String name;
    private double cost;
    private int inventory;

    public Vending(String name, double cost, int inventory) {
        this.name = name;
        this.cost = cost;
        this.inventory = inventory;
    }

    public Vending() {

    }

    public int getVendingId() {
        return VendingId;
    }

    public void setVendingId(int VendingId) {
        this.VendingId = VendingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.VendingId;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.cost);
        hash = 37 * hash + Objects.hashCode(this.inventory);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Vending other = (Vending) obj;

        if (this.inventory != other.inventory) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        return true;
    }
}
