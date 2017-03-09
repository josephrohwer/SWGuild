/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.contactlistmvc.dto;

/**
 *
 * @author mgaffney
 */
public class CompanyContactCount {

    private String company;
    private int numContacts;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNumContacts() {
        return numContacts;
    }

    public void setNumContacts(int numContacts) {
        this.numContacts = numContacts;
    }
}
