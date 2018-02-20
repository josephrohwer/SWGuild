/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.vendingmachinemvc.dto;

/**
 *
 * @author josephrohwer
 */
public class Change {

    private double amount;

    private int quarterTotal;
    private int dimeTotal;
    private int nickelTotal;
    private int pennyTotal;

    public Change(int quarterTotal, int dimeTotal, int nickelTotal, int pennyTotal) {
        this.quarterTotal = quarterTotal;
        this.dimeTotal = dimeTotal;
        this.nickelTotal = nickelTotal;
        this.pennyTotal = pennyTotal;
    }

    public Change() {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuarterTotal() {
        return quarterTotal;
    }

    public void setQuarterTotal(int quarterTotal) {
        this.quarterTotal = quarterTotal;
    }

    public int getDimeTotal() {
        return dimeTotal;
    }

    public void setDimeTotal(int dimeTotal) {
        this.dimeTotal = dimeTotal;
    }

    public int getNickelTotal() {
        return nickelTotal;
    }

    public void setNickelTotal(int nickelTotal) {
        this.nickelTotal = nickelTotal;
    }

    public int getPennyTotal() {
        return pennyTotal;
    }

    public void setPennyTotal(int pennyTotal) {
        this.pennyTotal = pennyTotal;
    }
}
