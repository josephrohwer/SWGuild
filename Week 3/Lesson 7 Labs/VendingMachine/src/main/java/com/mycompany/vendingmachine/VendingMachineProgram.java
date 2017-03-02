/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine;

import com.mycompany.vendingmachine.controller.VendingMachineController;
import com.mycompany.vendingmachine.dao.VendingMachine;

/**
 *
 * @author apprentice
 */
public class VendingMachineProgram {
    public static void main(String[] args) {
        new VendingMachineController(new VendingMachine()).runProgram();
    }
}
