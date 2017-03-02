/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dto;

import java.time.LocalDate;

/**
 *
 * @author josephrohwer
 */
public class Order {

    TaxRate taxRateDTO;
    Product productDTO;
    
    public String customer;
    public TaxRate taxRate;
    public Product productType;
    public double area;
    private final int orderNumber;
    private double costPerSquareFoot;
    private double laborCostPerSquareFoot;
    private double materialCost;
    private double laborCost;
    private double taxCost;
    private double totalCost;

    public Order(int orderNumber, String customer, TaxRate taxRate, Product productType, double area) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.taxRate = taxRate;
        this.productType = productType;
        this.area = area;
    }

    @Override
    public String toString() {
        String s = ("Order Number: " + orderNumber
                + "\nCustomer: " + customer
                + "\nState: " + taxRate.getStateCode()
                + "\nTax Rate: " + taxRate.getTaxRate()
                + "\nProduct Type: " + productType.getType()
                + "\nArea (Square Feet): " + area
                + "\nCost per Square Foot: $" + productType.getMaterialCostPerSquareFoot()
                + "\nLabor Cost per Square Foot: $" + productType.getLaborCostPerSquareFoot()
                + "\nMaterial Cost: $" + getMaterialCost()
                + "\nLabor Cost: $" + getLaborCost()
                + "\nTax: $" + getTaxCost()
                + "\nTotal: $" + getTotalCost() + "\n");
        return s;
    }

    public double getMaterialCost() {
        materialCost = getArea() * getProductType().getMaterialCostPerSquareFoot();
        return materialCost;
    }

    public double getLaborCost() {
        laborCost = getArea() * getProductType().getLaborCostPerSquareFoot();
        return laborCost;
    }

    public double getTaxCost() {
        taxCost = (getMaterialCost() + getLaborCost()) * getTaxRate().getTaxRate();
        return taxCost;
    }

    public double getTotalCost() {
        totalCost = getTaxCost() + getMaterialCost() + getLaborCost();
        return totalCost;
    }

    public double getCostPerSquareFoot() {
        costPerSquareFoot = productDTO.getMaterialCostPerSquareFoot();
        return costPerSquareFoot;
    }

    public double getLaborCostPerSquareFoot() {
        laborCostPerSquareFoot = productDTO.getLaborCostPerSquareFoot();
        return laborCostPerSquareFoot;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public TaxRate getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public Product getProductType() {
        return productType;
    }

    public void setProductType(Product productType) {
        this.productType = productType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
