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
public class HiLoLimited {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int random = (int) ((Math.random() * 100) + 1);
        int guess;
        int tries = 1;

        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");

        do {
            guess = kb.nextInt();

            if (guess > random) {
                System.out.println("Sorry, you are too high.");
                tries++;
            } else if (guess < random) {
                System.out.println("Sorry, you are too low.");
                tries++;
            } else if (guess == random && tries < 7) {
                System.out.println("You guessed it! What are the odds?!?");
                System.exit(0);
            }
        } while (tries <= 7);

        System.out.println("\nYou didn't guess it in 7 tries. You lose.");
    }
}
