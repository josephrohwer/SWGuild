/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab.dto;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public class InterestCalcDTO {
        
    private ArrayList<InterestCalcDTO> results = new ArrayList<>();
    private String yearNumber;
    private String currentBalance;
    private String yearlyInterest;
    private String yearlyEndPrincipal;

    public InterestCalcDTO(String yearNumber, String currentBalance, String yearlyInterest, String yearlyEndPrincipal) {
        this.yearNumber = yearNumber;
        this.currentBalance = currentBalance;
        this.yearlyInterest = yearlyInterest;
        this.yearlyEndPrincipal = yearlyEndPrincipal;
    }

    public InterestCalcDTO() {
    }

    public ArrayList<InterestCalcDTO> getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(ArrayList<InterestCalcDTO> results) {
        this.results = results;
    }

    /**
     * @return the yearNumber
     */
    public String getYearNumber() {
        return yearNumber;
    }

    /**
     * @param yearNumber the yearNumber to set
     */
    public void setYearNumber(String yearNumber) {
        this.yearNumber = yearNumber;
    }

    /**
     * @return the currentBalance
     */
    public String getCurrentBalance() {
        return currentBalance;
    }

    /**
     * @param currentBalance the currentBalance to set
     */
    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     * @return the yearlyInterest
     */
    public String getYearlyInterest() {
        return yearlyInterest;
    }

    /**
     * @param yearlyInterest the yearlyInterest to set
     */
    public void setYearlyInterest(String yearlyInterest) {
        this.yearlyInterest = yearlyInterest;
    }

    /**
     * @return the yearlyEndPrincipal
     */
    public String getYearlyEndPrincipal() {
        return yearlyEndPrincipal;
    }

    /**
     * @param yearlyEndPrincipal the yearlyEndPrincipal to set
     */
    public void setYearlyEndPrincipal(String yearlyEndPrincipal) {
        this.yearlyEndPrincipal = yearlyEndPrincipal;
    }

 
}
