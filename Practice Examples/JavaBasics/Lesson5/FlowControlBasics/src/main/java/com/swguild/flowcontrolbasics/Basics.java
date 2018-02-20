/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.flowcontrolbasics;
//import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author mgaffney
 */
public class Basics {
    
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = 12, b = 10, c = 19;

        if (a > b) {
            System.out.println("a > b");
        }

        if (b > a) {
            System.out.println("b > a");
        } else {
            System.out.println("a > b");
        }

        if (a == 10) {
            System.out.println("a = 10");
        } else if (a == 11) {
            System.out.println("a = 11");
        } else if (a == 12) {
            System.out.println("a = 12");
        } else {
            System.out.println("a is something else");
        }

        switch (a) {
            case 10:
                System.out.println("a = 10");
                break;
            case 11:
                System.out.println("a = 11");
                break;
            case 12:
                System.out.println("a = 12");
                break;
            default:
                System.out.println("a is something else");
        }
        
        int total = 0;
        int i = 0;
        
        while (i <= a) {
            total += i;
            i++;
        }
        
        System.out.println("Sum from 0 to " + a + " is " + total);
        
        total = 0;
        
        for(i = 0; i <= a; i++) {
            total += i;
        }
        System.out.println("Sum from 0 to " + a + " is " + total);
        
        int guess;
        
        do {
            System.out.print("Enter an integer");
            guess = kb.nextInt();
            if (guess > a) System.out.println("Too high.");
            else if (guess < a) System.out.println("Too low.");
            else System.out.println("You got it!");
        } while(guess != a);
        
    }
}
