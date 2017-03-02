/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luckysevens;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class LuckySevens {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
               
        int startingValue;
        
        System.out.print("Starting bet: $");
        startingValue = keyboard.nextInt();
        
        int currentValue = startingValue;
        int totalRolls = 0;
        int maxValue = currentValue;
        int rollCount = totalRolls;
        
        while(currentValue > 0) {
            int die1 = (int)(Math.random() * 6) + 1;
            int die2 = (int)(Math.random() * 6) + 1;
            int rollNumber = die1 + die2;
            totalRolls = totalRolls + 1;        
            
        if (rollNumber == 7) {
            currentValue = currentValue + 4;
        } 
        else {
            currentValue = currentValue - 1;
        }
            
        if (currentValue > maxValue) {
            maxValue = currentValue;
            rollCount = totalRolls;
        }
        }
        System.out.println("Starting Bet: $" + startingValue);
        System.out.println("Total Rolls Before Going Broke: " + totalRolls);
        System.out.println("Highest Amount Won: $" + maxValue);
        System.out.println("Roll Count at Highest Amount Won: " + rollCount);
        
    }
}