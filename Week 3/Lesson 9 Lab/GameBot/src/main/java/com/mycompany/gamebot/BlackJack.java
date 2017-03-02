/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamebot;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BlackJack implements GameBot {

        @Override
        public String returnName() {
            String name = "Blackjack";
            return name;
        }
        
        @Override
        public void runGame() {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int playerCard1 = 2 + r.nextInt(10);
        int playerCard2 = 2 + r.nextInt(10);
        int playerCardHit;
        int playerTotal = (playerCard1 + playerCard2);
        String hitStay;
        int computerCard1 = 2 + r.nextInt(10);
        int computerCard2 = 2 + r.nextInt(10);
        int computerCardHit;
        int computerTotal = (computerCard1 + computerCard2);

        System.out.println("Wlcome to Joseph's blackjack program!");
        System.out.println("You get a " + playerCard1 + " and a " + playerCard2 + ".");
        System.out.println("Your total is " + playerTotal + ".\n");

        System.out.println("The dealer has a " + computerCard1 + " showing, and a hidden card.");
        System.out.println("His total is hidden, too.\n");

        System.out.print("Would you like to \"hit\" or \"stay\"? ");
        hitStay = kb.nextLine();

        while (hitStay.equals("hit")) {
            System.out.println("You drew a " + (playerCardHit = 2 + r.nextInt(10)) + ".");
            playerTotal += playerCardHit;
            System.out.println("Your total is " + playerTotal + ".\n");
            if (playerTotal > 21) {
                System.out.println("You bust. YOU LOSE!");
                return;
            }
            System.out.print("Would you like to \"hit\" or \"stay\"? ");
            hitStay = kb.nextLine();
        }

        System.out.println("");
        System.out.println("Okay, dealer's turn.");
        System.out.println("His hidden card was a " + computerCard2 + ".");
        System.out.println("His total is " + computerTotal + ".\n");

        while (computerTotal <= 16) {
            System.out.println("Dealer chooses to hit.");
            System.out.println("He draws a " + (computerCardHit = 2 + r.nextInt(10)) + ".");
            computerTotal += computerCardHit;
            System.out.println("His total is " + computerTotal + ".\n");
        }

        if (computerTotal > 21) {
            System.out.println("Dealer busts. YOU WIN!");
            return;
        }

        System.out.println("Dealer stays.\n");

        System.out.println("Dealer total is " + computerTotal + ".");
        System.out.println("Your total is " + playerTotal + ".\n");

        if (playerTotal > computerTotal) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOSE!");
        }
    }
}