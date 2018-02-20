/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int choice;
        int sum = 0;
        
        System.out.println("I will add up the numbers you give me.");
        
        do {
            System.out.print("Number: ");
            choice = kb.nextInt();
            sum += choice;
            System.out.println("The total so far is " + sum);
        } while (choice != 0);
        
        System.out.println("The total is " + sum);
    }
}
