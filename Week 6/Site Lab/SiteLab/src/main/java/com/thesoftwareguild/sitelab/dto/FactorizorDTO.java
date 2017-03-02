/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public class FactorizorDTO {

    private ArrayList<Integer> factors = new ArrayList<>();
    private int value;
    private String isPerfect;
    private String isPrime;

    public ArrayList<Integer> getFactors() {
        return factors;
    }

    public void setFactors(ArrayList<Integer> factors) {
        this.factors = factors;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getIsPerfect() {
        return isPerfect;
    }

    public void setIsPerfect(String isPerfect) {
        this.isPerfect = isPerfect;
    }

    public String getIsPrime() {
        return isPrime;
    }

    public void setIsPrime(String isPrime) {
        this.isPrime = isPrime;
    }
}
