/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.controller;

import com.mycompany.addressbook.dao.AddressBookInterface;
import com.mycompany.addressbook.dto.Address;
import com.mycompany.addressbook.ui.ConsoleIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public class AddressBookController {

    private final ConsoleIO console = new ConsoleIO();
    private final AddressBookInterface book;

    public AddressBookController(AddressBookInterface interf) {
        book = interf;
    }

    public void displayMenu() {
        System.out.println("Please select the operation you wish to perform:\n"
                + "     1. Add Adress\n"
                + "     2. Delete Address\n"
                + "     3. Find Address\n"
                + "     4. List Address Count\n"
                + "     5. List All Addresses\n"
                + "     6. Exit");
        System.out.print("> ");
        int choice = console.readInteger("", 1, 6);
        System.out.println("");

        switch (choice) {
            case 1:
                addAddress();
                break;
            case 2:
                removeAddress();
                break;
            case 3:
                findAddress();
                break;
            case 4:
                addressCount();
                break;
            case 5:
                addressList();
                break;
            case 6:
                System.out.println("Goodbye.");
                System.exit(0);
            default:
                break;
        }
    }

    public void addAddress() {
        System.out.print("Please Enter First Name: ");
        String firstName = console.readString("");
        System.out.print("Please Enter Last Name: ");
        String lastName = console.readString("");
        System.out.print("Please Enter Street Address: ");
        String streetAddress = console.readString("");
        System.out.print("Please Enter City: ");
        String city = console.readString("");
        System.out.print("Please Enter State: ");
        String state = console.readString("");
        System.out.print("Please Enter Zip: ");
        String zip = console.readString("");

        Address ad = new Address(firstName, lastName, streetAddress, city, state, zip);
        try {
            book.addAddress(ad);
        } catch (Exception e) {
        }

        System.out.println("");
        System.out.print("Address Added. Press 1 to go to Main Menu: ");
        console.readInteger("", 1, 1);
        System.out.println("");
        displayMenu();
    }

    public void removeAddress() {
        System.out.print("Please Enter Last Name of Address to Delete: ");
        String lastName = console.readString("");
        System.out.print("Really Delete? (y/n): ");
        String choice = console.readString("");

        if (choice.equals("y")) {
            try {
                book.removeAddress(lastName);
            } catch (Exception e) {
            }
            System.out.print("Address Deleted. Press 1 to go to Main Menu: ");
            console.readInteger("", 1, 1);
            System.out.println("");
            displayMenu();
        } else {
            System.out.println("Address Not Deleted. Reutrning to Main Menu.\n");
            System.out.println("");
            displayMenu();
        }
    }

    public void findAddress() {
        System.out.println("Search by\n"
                + "    1.) Last Name\n"
                + "    2.) City\n"
                + "    3.) State\n"
                + "    4.) Zipcode");
        System.out.print("> ");
        int choice = console.readInteger("", 1, 4);

        if (choice == 1) {
            System.out.print("Please Enter Last Name of Address to Find: ");
            String findLastName = console.readString("");
            System.out.println("");

            List<Address> addressTemp = new ArrayList<>(book.findAddress(findLastName));
            if (addressTemp.size() > 0) {
                addressTemp.stream().forEach((a) -> {
                    System.out.println(a);
                });
            } else {
                System.out.println("No Addresses With That Last Name Found.");
            }
        } else if (choice == 2) {
            System.out.print("Please Enter City of Address to Find: ");
            String city = console.readString("");
            System.out.println("");

            List<Address> addressTemp = new ArrayList<>(book.findAddressCity(city));
            if (addressTemp.size() > 0) {
                addressTemp.stream().forEach((a) -> {
                    System.out.println(a);
                });
            } else {
                System.out.println("No Addresses With That City Name Found.");
            }
        } else if (choice == 3) {
            System.out.print("Please Enter State of Address to Find: ");
            String state = console.readString("");
            System.out.println("");

            Map<String, List<Address>> addressTemp = book.findAddressState(state);
            String f = addressTemp.values().toString()
                    .replace(",", "\n")
                    .replace("[", "")
                    .replace("]", "");
           
            System.out.println(f);  
        } else if (choice == 4) {
            System.out.print("Please Enter Zipcode of Address to Find: ");
            String zipcode = console.readString("");
            System.out.println("");

            List<Address> addressTemp = new ArrayList<>(book.findAddressZip(zipcode));
            if (addressTemp.size() > 0) {
                addressTemp.stream().forEach((a) -> {
                    System.out.println(a);
                });
            } else {
                System.out.println("No Addresses With That Zipcode Found.");
            }
        }

        System.out.print("Press 1 to go to Main Menu: ");
        console.readInteger("", 1, 1);
        System.out.println("");
        displayMenu();
    }

    public void addressCount() {
        int size = book.addressCount();

        System.out.println("There are " + size + " Addresses in the Book.");
        System.out.print("Press 1 to go to Main Menu: ");
        console.readInteger("", 1, 1);
        System.out.println("");
        displayMenu();
    }

    public void addressList() {
        System.out.println("Listing Adresses...");

        List<Address> addressTemp = new ArrayList<>(book.addressList());
        if (addressTemp.size() > 0) {
            addressTemp.stream().forEach((d) -> {
                System.out.println(d);
            });
        } else {
            System.out.println("No Addresses Found.");
        }

        System.out.print("Press 1 to go to Main Menu: ");
        console.readInteger("", 1, 1);
        System.out.println("");
        displayMenu();
    }
}
