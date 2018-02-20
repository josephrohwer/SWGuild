/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.dto;

/**
 *
 * @author apprentice
 */
public class Address {

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String cityStateZip;

    @Override
    public String toString() {
        String addressTemp = ("First Name: " + getFirstName() + "\nLast Name: " + getLastName()
                + "\nStreet Address: " + getStreetAddress() + "\nCity, State, Zip: "
                + getCityStateZip() + "\n");
        return addressTemp;
    }

    public Address(String firstName, String lastName, String streetAddress, String cityStateZip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.cityStateZip = cityStateZip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityStateZip() {
        return cityStateZip;
    }

    public void setCityStateZip(String cityStateZip) {
        this.cityStateZip = cityStateZip;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
