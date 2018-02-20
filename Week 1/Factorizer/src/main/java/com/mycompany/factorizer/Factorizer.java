/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorizer;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Factorizer {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);  
        
        int factor;
        int temp = 0;
        boolean prime = true;
        
        System.out.print("What number would you like to factor? ");
        factor = kb.nextInt();
        
        System.out.print("The factors of " + factor + " are: \n");
        
        for (int i = 1; i <= factor / 2; i++) {
            if (factor % i == 0) {
                System.out.print(i + "\n");
                temp += i;
            }
        }
                
        for (int i = 2; i <= factor / 2; i++) {
            if (factor % i == 0) {
                prime = false;
            }
        }
        
        if (temp == factor) {
            System.out.println(factor + " is a perfect number.");
        }
        else {
            System.out.println(factor + " is not a perfect number.");
        }
        
	if (prime) {
	   System.out.println(factor + " is a prime number.");
        }
        else {
	   System.out.println(factor + " is not a prime number.");
        }
        
    }
}