/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.littlequiz;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class LittleQuiz {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int q1;
        int q2;
        int q3;
        int total = 0;
        
        System.out.println("Lord of the Rings Quiz\n");
        System.out.println(""
                + "Q1) How many Rings of Power were forged in the second age?\n"
                + "         1) 1\n"
                + "         2) 19\n"
                + "         3) 20\n");
        q1 = kb.nextInt();
        
        if (q1 == 2) {
            System.out.println("That's right!");
        }
        else if (q1 != 2) {
            System.out.println("That's wrong.");
        }
        
        System.out.println(""
                + "Q2) In \"Fellowship of the Ring,\" what gift does Lady Galadriel give Gimli before the fellowship leaves Lothlorien?\n"
                + "         1) Three strands of her hair\n"
                + "         2) Elvish rope\n"
                + "         3) A dagger\n");
        q2 = kb.nextInt();
        
        if (q2 == 1) {
            System.out.println("That's right!");
        }
        else if (q2 != 1) {
            System.out.println("That's wrong.");
        }
        
        System.out.println(""
                + "Q1) Gollum wasn't always Gollum. He was a hobbit of the River-folk. What was his name?\n"
                + "         1) Bandobras\n"
                + "         2) Tobold\n"
                + "         3) Smeagol\n");
        q3 = kb.nextInt();
        
        if (q3 == 3) {
            System.out.println("That's right!");
        }
        else if (q3 != 3) {
            System.out.println("That's wrong.");
        }
        
        if (q1 == 2 && q2 == 1 && q3 == 3) {
            total = total + 3;
        }
        else if (q1 == 2 && q2 == 1 || q3 == 3) {
            total = total + 2;
        }
        else if (q1 == 2 || q2 == 1 && q3 == 3) {
            total = total + 2;
        }
        else if (q1 == 2 || q2 == 1 || q3 == 3) {
            total = total + 1;
        }
        else {
            total = 0;
        }
        
        System.out.println("Overall, you got " + total + " out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
}
