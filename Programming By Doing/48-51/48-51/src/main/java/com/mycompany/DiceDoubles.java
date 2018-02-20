/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class DiceDoubles {

    public static void main(String[] args) {
        
        Random r = new Random();
        
        int roll1;
        int roll2;
        
        System.out.println("HERE COMES THE DICE!\n");
        
        do {
            roll1 = 1 + r.nextInt(6);
            System.out.println("Roll #1: " + roll1);
            
            roll2 = 1 + r.nextInt(6);
            System.out.println("Roll #2: " + roll2);
            
            System.out.println("The total is " + (roll1 + roll2) + "!");
        } while (roll1 != roll2);
    }
}
