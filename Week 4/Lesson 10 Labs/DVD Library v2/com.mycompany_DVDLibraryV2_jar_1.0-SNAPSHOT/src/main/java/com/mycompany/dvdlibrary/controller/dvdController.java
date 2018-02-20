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
import java.util.Map;

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
                + "     4. Find DVD\n"
                + "     5. Exit");
        int choice = console.readInteger("", 1, 5);

        if (choice == 1) {
            addDVD();
        } else if (choice == 2) {
            removeDVD();
        } else if (choice == 3) {
            listDVDs();
        } else if (choice == 4) {
            findDVD();
        } else if (choice == 5) {
            System.out.println("\nThank You!");
            System.exit(0);
        }
    }

    public void addDVD() {
        System.out.print("Title: ");
        String title = console.readString("");
        System.out.print("Release Date: ");
        int releaseDate = console.readInteger("", 1900, 2016);
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
        List<dvd> dvdTemp = new ArrayList<>(lib.listDVD());
        for (dvd d : dvdTemp) {
            System.out.println(d);
        }

        System.out.println("Press 1 to go to Main Menu");
        console.readInteger("", 1, 1);
        displayMenu();
    }

    public void findDVD() {

        System.out.println("Please select the operation you wish to perform:\n"
                + "     1. Find DVD by title\n"
                + "     2. Find DVD released in the last 'N' years\n"
                + "     3. Find DVD with a certain rating\n"
                + "     4. Find DVD by a certain director\n"
                + "     5. Find DVD by a certain studio\n"
                + "     6. Find the average age of the DVDs\n"
                + "     7. Find the newest DVD\n");
        int choice = console.readInteger("", 1, 7);

        if (choice == 1) {
            String title = console.readString("Title: ");

            List<dvd> dvdTemp = new ArrayList<>(lib.findDVD(title));

            for (dvd d : dvdTemp) {
                System.out.println(d);
            }

        } else if (choice == 2) {
            int n = console.readInteger("DVDs released in the past how many years: ", 1, 115);
            List<dvd> dvdTemp = new ArrayList<>(lib.findDVDbyNYears(n));
            
            for (dvd d : dvdTemp) {
                System.out.println(d);
            }
        } else if (choice == 3) {
            String rating = console.readString("Rating: ");

            List<dvd> dvdTemp = new ArrayList<>(lib.findDVDbyRating(rating));

            for (dvd d : dvdTemp) {
                System.out.println(d);
            }
        } else if (choice == 4) {
            String director = console.readString("Director: ");

            Map<String, List<dvd>> dvdTemp = lib.findDVDbyDirector(director);
            String f = dvdTemp.values().toString()
                    .replace(",", "\n")
                    .replace("[", "")
                    .replace("]", "");

            System.out.println(f);
        } else if (choice == 5) {
            String studio = console.readString("Studio: ");

            List<dvd> dvdTemp = new ArrayList<>(lib.findDVDbyStudio(studio));

            for (dvd d : dvdTemp) {
                System.out.println(d);
            }
        } else if (choice == 6) {
            System.out.println(lib.averageAge() + " years");
        } else if (choice == 7) {
            System.out.println(lib.findDVDbyNew());
        }

        System.out.println("Press 1 to go to Main Menu");
        console.readInteger("", 1, 1);
        displayMenu();
    }
}
