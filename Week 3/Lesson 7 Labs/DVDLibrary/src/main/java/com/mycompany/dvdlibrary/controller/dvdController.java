/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.controller;

import com.mycompany.dvdlibrary.dto.dvd;
import com.mycompany.dvdlibrary.ui.ConsoleIO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.dvdlibrary.dao.dvdInterface;

/**
 *
 * @author apprentice
 */
public class dvdController {

    private ConsoleIO console = new ConsoleIO();
    private dvdInterface lib;
    
    public dvdController(dvdInterface interf) {
        lib = interf;
    }

    public void displayMenu() {
        System.out.println("Please select the operation you wish to perform:\n"
                + "     1. Add DVD\n"
                + "     2. Remove DVD\n"
                + "     3. List of DVD's\n"
                + "     4. Find DVD by title\n");
        int choice = console.readInteger("", 1, 5);

        if (choice == 1) {
            addDVD();
        } else if (choice == 2) {
            removeDVD();
        } else if (choice == 3) {
            listDVDs();
        } else if (choice == 4) {
            findDVD();
        }
    }

    public void addDVD() {
        System.out.print("Title: ");
        String title = console.readString("");
        System.out.print("Release Date: ");
        String releaseDate = console.readString("");
        System.out.print("MPAA Rating: ");
        String rating = console.readString("");
        System.out.print("Director's Name: ");
        String directorName = console.readString("");
        System.out.print("Studio's Name: ");
        String studioName = console.readString("");
        System.out.print("Comment: ");
        String comment = console.readString("");

        dvd cd = new dvd(title, releaseDate, rating, directorName, studioName, comment);
        try {
            lib.addDVD(cd);
        } catch (Exception e) {

        }

        System.out.println("");
        System.out.println("DVD Added. Press 1 to go to Main Menu");
        console.readInteger("", 1, 1);
        displayMenu();
    }

    public void removeDVD() {
        System.out.print("Please Enter Title of Movie to Remove: ");
        String title = console.readString("");
        System.out.println("Really Remove? (y/n) ");
        String choice = console.readString("");
        if (choice.equals("y")) {
            try {
                lib.removeDVD(title);
            } catch (Exception ex) {
                Logger.getLogger(dvdController.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("DVD Removed. Press 1 to go to Main Menu");
            console.readInteger("", 1, 1);
            displayMenu();
        } else {
            System.out.println("DVD Not Removed. Reutrning to Main Menu.\n");
            displayMenu();
        }
    }

    public void listDVDs() {
        System.out.println("Listing DVD's\n");
        List <dvd> dvdTemp = new ArrayList<>(lib.listDVD());
        for (dvd d: dvdTemp) {
            System.out.println(d);
        }
        
        System.out.println("Press 1 to go to Main Menu");
        console.readInteger("", 1, 1);
        displayMenu();
    }

    public void findDVD() {
        System.out.print("Title: ");
        String title = console.readString("");      
        
        List <dvd> dvdTemp = new ArrayList<>(lib.findDVD(title));
        
        for (dvd d : dvdTemp) {
            System.out.println(d);
        }
        
        System.out.println("Press 1 to go to Main Menu");
        console.readInteger("", 1, 1);
        displayMenu();
    }
}
