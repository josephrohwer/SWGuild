/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HighScore {

    public static void main(String[] args) throws Exception {

        PrintWriter pw = new PrintWriter(new FileWriter("score.txt"));
        Scanner kb = new Scanner(System.in);
        
        int score;
        String name;
        
        System.out.println("You got a high score!\n");
        
        System.out.println("Please enter your score: ");
        score = kb.nextInt();
        
        System.out.println("Please enter your name: ");
        name = kb.next();
        
        System.out.println("Data stored into score.txt.");
        
        pw.println("Score = " + score + "\nName = " + name);
        pw.close();
    }
}
