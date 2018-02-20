/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dumbcalculator;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class DumbCalculator {
    public static void main(String[] args) {
        
        float first;
        float second;
        float third;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your first number? ");
        first = keyboard.nextFloat();
        
        System.out.println("What is your second number? ");
        second = keyboard.nextFloat();
        
        System.out.println("What is your third number? ");
        third = keyboard.nextFloat();
        
        float result = ((first + second + third) / 2.0f);
        
        System.out.println("(" + first + " + " + second +  " + " + third + ") / 2 is... " + result);
    }
}
