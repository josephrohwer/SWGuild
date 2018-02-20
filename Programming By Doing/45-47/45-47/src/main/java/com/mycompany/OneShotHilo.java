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
public class OneShotHilo {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        int random = (int)((Math.random() *100) + 1);
        int guess;
        
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        guess = kb.nextInt();
        
        if (guess > random) {
            System.out.println("Sorry, you are too high. I was thinking of " + random + ".");
        }
        else if (guess < random) {
            System.out.println("Sorry, you are too low. I was thinking of " + random + ".");
        } else {
            System.out.println("You guessed it! What are the odds?!?");
        }    
    }
}
