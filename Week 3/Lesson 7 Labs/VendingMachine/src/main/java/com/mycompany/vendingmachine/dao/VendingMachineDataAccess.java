/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dao;

import com.mycompany.vendingmachine.dto.Vending;
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
public class VendingMachineDataAccess {
    public void writeInfo(List<Vending> info) throws Exception {
        try (PrintWriter out = new PrintWriter(new FileWriter("items.txt"))) {
            info.stream().forEach((add) -> {
                out.println(add.getName()
                        + "::" + add.getCost()
                        + "::" + add.getInventory());
            });
            out.flush();
        }
    }

    public List<Vending> readInfo() throws Exception {
        List<Vending> info = new ArrayList<>();
        try (Scanner kb = new Scanner(new BufferedReader(new FileReader("items.txt")))) {
            String temp1;
            String[] tempStrings;
            
            while (kb.hasNextLine()) {
                temp1 = kb.nextLine();
                tempStrings = temp1.split("::");
                info.add(new Vending(tempStrings[0], tempStrings[1], Integer.parseInt(tempStrings[2])));
            }
        }

        return info;
    }
}
