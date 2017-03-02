/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author josephrohwer
 */
public class Contact {

    private int contactId;
    @NotEmpty(message = "Please enter a phone number")
    private String phone;
    @Email(message = "Please enter a valid email address")
    @NotEmpty(message = "Please enter an email address")
    private String email;
    @NotEmpty(message = "Please enter a twitter handle")
    private String twitter;
    @NotEmpty(message = "Please enter a facebook page")
    private String facebook;

    public Contact(String phone, String email, String twitter, String facebook) {
        this.phone = phone;
        this.email = email;
        this.twitter = twitter;
        this.facebook = facebook;
    }
    
    public Contact() {
        
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
    
}
