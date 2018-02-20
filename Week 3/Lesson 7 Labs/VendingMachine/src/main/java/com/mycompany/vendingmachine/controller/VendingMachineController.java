/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.controller;

import com.mycompany.vendingmachine.dao.VendingMachineInterface;
import com.mycompany.vendingmachine.dto.Vending;
import com.mycompany.vendingmachine.ui.ConsoleIO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class VendingMachineController {

    ConsoleIO console = new ConsoleIO();
    private VendingMachineInterface inter;

    public VendingMachineController(VendingMachineInterface interf) {
        inter = interf;
    }

    public void runProgram() {
        System.out.println("          &~~~~~~~~~~~~~~~~~&\n"
                + "          & VENDING MACHINE &\n"
                + "          &~~~~~~~~~~~~~~~~~&\n"
                + "  _____________________________________");

        System.out.println("        Item            Cost  Inventory");
        List<Vending> itemTemp = new ArrayList<>(inter.listItems());
        for (int i = 1; i <= itemTemp.size(); i++) {
            if (itemTemp.get(i - 1).getInventory() != 0) {
                System.out.println("  " + i + ".) " + itemTemp.get(i - 1));
            }
        }
        System.out.println("  0.) Exit");

        System.out.print("\nPut in money (ex: $1.25 -> 125)\n" + "> ");
        int money = console.readInteger("", 1, 1000);
        System.out.println("");
        System.out.print("Make a selection\n" + "> ");
        int choice = console.readInteger("", 1, 5);
        System.out.println("");
        
        int itemCost = 0;
        if (choice == 1) {
            itemCost = 229;
        } else if (choice == 2) {
            itemCost = 149;
        } else if (choice == 3) {
            itemCost = 319;
        } else if (choice == 4) {
            itemCost = 124;
        } else if (choice == 0) {
            System.out.println("Thank you!");
            System.exit(0);
        }

        if (itemCost > money) {
            System.out.println("Insufficient funds. You have " + money);
        } else if (itemCost <= money) {

            inter.updateInventory(choice);
            money = (money - itemCost);
            int quarter = 25;
            int quarterTotal = 0;
            int dime = 10;
            int dimeTotal = 0;
            int nickel = 5;
            int nickelTotal = 0;
            int penny = 1;
            int pennyTotal = 0;
            
            do {
                while (quarter <= money) {
                    quarterTotal++;
                    money -= quarter;
                }
                while (dime <= money) {
                    dimeTotal++;
                    money -= dime;
                }
                while (nickel <= money) {
                    nickelTotal++;
                    money -= nickel;
                }
                while (penny <= money) {
                    pennyTotal++;
                    money -= penny;
                }
            } while (money != 0);
            System.out.println("Enjoy! Here is your Change\n" + ""+ 
                               "Quarters: " + quarterTotal + "\n" +
                               "Dimes:    " + dimeTotal + "\n" +
                               "Nickels:  " + nickelTotal + "\n" +
                               "Pennies:  " + pennyTotal + "\n");
        }
    }
}
