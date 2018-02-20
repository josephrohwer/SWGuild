/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamebot;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class GameBotUI {

    public static void main(String[] args) {

        ConsoleIO console = new ConsoleIO();
        ArrayList<GameBot> games = new ArrayList<>();

        games.add(new BlackJack());
        games.add(new RockPaperScissors());
        games.add(new LuckySevens());

        int choice = 0;

        do {
            System.out.println("\nWhich game would you like to play?");
            int i = 1;
            for (GameBot b : games) {
                System.out.println(i + ".) " + b.returnName());
                i += 1;
            }
            System.out.println("4.) Exit");
            System.out.print("\n> ");
            choice = console.readInteger("", 1, 4);
            System.out.println("");

            if (choice != 4) {
                games.get((choice - 1)).runGame();
            }
        } while (choice != 4);

        System.out.println("Thanks for playing!");
    }
}
