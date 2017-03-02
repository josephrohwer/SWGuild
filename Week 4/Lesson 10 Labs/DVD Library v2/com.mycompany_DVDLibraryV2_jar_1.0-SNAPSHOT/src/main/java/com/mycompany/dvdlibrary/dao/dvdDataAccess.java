/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.dao;

import com.mycompany.dvdlibrary.dto.dvd;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class dvdDataAccess {
    
    public void writeDVD(List<dvd> dvds) throws Exception {
        try (PrintWriter out = new PrintWriter(new FileWriter("dvds.txt", true))) {
            dvds.stream().forEach((add) -> {
                out.println(add.getTitle()
                        + "::" + add.getReleaseDate()
                        + "::" + add.getMPAARating()
                        + "::" + add.getDirectorName()
                        + "::" + add.getStudio()
                        + "::" + add.getComment());
            });
            out.flush();
        }
    }

    public List<dvd> readDVD() throws Exception {
        List<dvd> dvds = new ArrayList<>();
        try (Scanner kb = new Scanner(new BufferedReader(new FileReader("dvds.txt")))) {
            String temp;
            String[] tempStrings;
            
            while (kb.hasNextLine()) {
                temp = kb.nextLine();
                tempStrings = temp.split("::");
                dvds.add(new dvd(tempStrings[0], Integer.parseInt(tempStrings[1]), tempStrings[2], tempStrings[3], tempStrings[4], tempStrings[5]));
            }
        }

        return dvds;
    }
}
