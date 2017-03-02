/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab.dto;

/**
 *
 * @author josephrohwer
 */
public class LuckySevenDTO {

    private int startingValue;
    private int totalRolls;
    private int maxValue;
    private int rollCount;

    public int getStartingValue() {
        return startingValue;
    }

    public void setStartingValue(int startingValue) {
        this.startingValue = startingValue;
    }

    public int getTotalRolls() {
        return totalRolls;
    }

    public void setTotalRolls(int totalRolls) {
        this.totalRolls = totalRolls;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getRollCount() {
        return rollCount;
    }

    public void setRollCount(int rollCount) {
        this.rollCount = rollCount;
    }
}
