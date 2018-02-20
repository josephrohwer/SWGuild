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
public class CountingWhile {

    public static void main(String[] args) {

// 1.) n++ increases the value of n by 1 each time it goes through the loop.

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it several times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.println("How many times? ");
        int howMany = keyboard.nextInt();
        
        int n = 1;
        while (n <= howMany) {
            System.out.println((n * 10) + ". " + message);
            n++;
        }

    }
}