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
public class EnterPIN {

// 1.) It will execute the code inside it when the condition is met.    
// 2.) A while loop keeps repeating itself until the condition is no longer met.
// 3.) Because entry was was already assigned to an int outside of the while loop.
// 4.) It loops forever because it has no possible way of leaving the loop.
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}
