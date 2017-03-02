/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.dao;

import com.mycompany.addressbook.dto.Address;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josephrohwer
 */
public class AddressDataAccess {

    public void writeAddresses(List<Address> addresses) throws Exception {
        try (PrintWriter out = new PrintWriter(new FileWriter("addresses.txt", true))) {
            addresses.stream().forEach((add) -> {
                out.println(add.getFirstName()
                        + "::" + add.getLastName()
                        + "::" + add.getStreetAddress()
                        + "::" + add.getCityStateZip());
            });
            out.flush();
        }
    }

    public List<Address> readAddresses() throws Exception {
        List<Address> addresses = new ArrayList<>();
        try (Scanner kb = new Scanner(new BufferedReader(new FileReader("addresses.txt")))) {
            String temp;
            String[] tempStrings;

            while (kb.hasNextLine()) {
                temp = kb.nextLine();
                tempStrings = temp.split("::");
                addresses.add(new Address(tempStrings[0], tempStrings[1], tempStrings[2], tempStrings[3]));
            }
        }

        return addresses;
    }
}
