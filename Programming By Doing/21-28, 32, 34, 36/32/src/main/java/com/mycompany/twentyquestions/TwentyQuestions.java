/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twentyquestions;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class TwentyQuestions {
    public static void main(String[] args) {
               
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Two Questions!");
        System.out.println("Think of an boject, and I'll try to guess it.");
        
        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        String question1 = kb.nextLine();
        
        System.out.println("Question 2) Is it bigger than a breadbox? Enter yes or no.");
        String question2 = kb.nextLine();        
        
        if (question1.equals("animal")) {
            if (question2.equals("yes")) {
                System.out.println("My guess is that you're thinking of a moose.");
            }
            if (question2.equals("no")) {
                System.out.println("My guess is that you're thinking of a squirell.");
            }
        }
        else if (question1.equals("vegetable")) {
            if (question2.equals("yes")) {
                System.out.println("My guess is that you're thinking of a watermelon.");   
            }
            if (question2.equals("no")) {
                System.out.println("My guess is that you're thinking of a carrot."); 
            }
        }
        else if (question1.equals("mineral")) {
            if (question2.equals("yes")) {
                System.out.println("My guess is that you're thinking of a Camaro.");
            }
            if (question2.equals("no")) {
                System.out.println("My guess is that you're thinking of a paper clip.");      
            }
        }
        
    }
}
