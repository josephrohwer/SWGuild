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
public class ContactDaoInMemImpl implements ContactDao {

    Contact contact = new Contact();
    
    @Override
    public Contact getContact(int id) {
        return contact;
    }
    
    @Override
    public Contact addContact(Contact ca) {
        contact = ca;
        return ca;
    }

    @Override
    public void updateContact(Contact ca) {
        contact = ca;
    }
}
