/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dto;

/**
 *
 * @author josephrohwer
 */
public class Product {

    private final String type;
    private final double materialCostPerSquareFoot;
    private final double laborCostPerSquareFoot;

    public Product(String type, double materialCostPerSquareFoot, double laborCostPerSquareFoot) {
        this.type = type;
        this.materialCostPerSquareFoot = materialCostPerSquareFoot;
        this.laborCostPerSquareFoot = laborCostPerSquareFoot;
    }

    public String getType() {
        return type;
    }

    public double getMaterialCostPerSquareFoot() {
        return materialCostPerSquareFoot;
    }

    public double getLaborCostPerSquareFoot() {
        return laborCostPerSquareFoot;
    }
}
