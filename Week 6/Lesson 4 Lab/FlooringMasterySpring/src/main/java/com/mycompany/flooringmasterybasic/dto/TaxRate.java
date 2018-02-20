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
public class TaxRate {

    private final String stateCode;
    private final double taxRate;

    public TaxRate(String stateCode, double taxRate) {
        this.stateCode = stateCode;
        this.taxRate = taxRate / 100;
    }

    public String getStateCode() {
        return stateCode;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
