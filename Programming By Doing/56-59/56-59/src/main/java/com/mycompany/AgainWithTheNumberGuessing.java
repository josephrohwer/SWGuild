/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AgainWithTheNumberGuessing {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        int x = 1 + r.nextInt(10);
        int y;
        int tries = 1;

        System.out.println("I'm thinking of a number from 1 to 10.");

        do {
            System.out.print("Your guess: ");
            y = kb.nextInt();

            if (x == y) {
                System.out.println("That's right! My secret number was " + x + "!\n");
                System.out.println("It only took you " + tries + " tries.");
            } else {
                System.out.println("That is incorrect. Guess again.\n");
                tries++;
            }
        } while (x != y);

    }
}
