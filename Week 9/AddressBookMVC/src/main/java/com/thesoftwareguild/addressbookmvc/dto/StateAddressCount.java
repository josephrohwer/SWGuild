/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.dto;

/**
 *
 * @author apprentice
 */
public class StateAddressCount {

    private String state;
    private int numAddresses;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumAddresses() {
        return numAddresses;
    }

    public void setNumAddresses(int numAddresses) {
        this.numAddresses = numAddresses;
    }
}
