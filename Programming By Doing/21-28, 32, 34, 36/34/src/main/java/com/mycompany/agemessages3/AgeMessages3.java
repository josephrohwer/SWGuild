/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agemessages3;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class AgeMessages3 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Hey, what's your name? ");
        name = keyboard.next();
        
        System.out.println("Ok, " + name + ", how old are you?");
        age = keyboard.nextInt();
        
        if (age < 16) {
            System.out.println("You can't drive, vote, or rent a car, " + name + ".");
        }
        if (age < 18 && age > 16) {
            System.out.println("You can't drive or rent a car, " + name + ".");
        }
        if (age < 25 && age >= 18) {
            System.out.println("You can't rent a car, " + name + ".");
        }
        if (age >= 25) {
            System.out.println("You can do anything that's legal, " + name + ".");
        }
        
    }
}
