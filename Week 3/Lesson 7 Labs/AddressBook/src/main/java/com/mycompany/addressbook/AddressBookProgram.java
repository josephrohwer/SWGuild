/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook;

import com.mycompany.addressbook.controller.AddressBookController;
import com.mycompany.addressbook.dao.AddressBook;

/**
 *
 * @author apprentice
 */
public class AddressBookProgram {

    public static void main(String[] args) {
        new AddressBookController(new AddressBook()).displayMenu();
    }
}
