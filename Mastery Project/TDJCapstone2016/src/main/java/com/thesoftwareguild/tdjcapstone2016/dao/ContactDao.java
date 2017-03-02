/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.Contact;

/**
 *
 * @author josephrohwer
 */
public interface ContactDao {
    
    public Contact getContact(int id);
    
    public Contact addContact(Contact ca);
    
    public void updateContact(Contact ca);
}
