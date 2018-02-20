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
public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int random = (int)((Math.random() * 3) + 1);
        int guess;
        
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                                       "He glances at you out of the corner of his eye and starts shuffling.\n" +
                                       "He lays down three cards.\n");
        System.out.println("Which one is the ace?");
        System.out.println("\n        ##  ##  ##\n" +
                                       "        ##  ##  ##\n" +
                                       "        1   2   3 \n");
      guess = kb.nextInt();
        System.out.println("");
        
        if (guess == random) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        }
        else {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + random + ".");
        }
        
    }
}
