/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author apprentice
 */
public class Dice {
    public static void main(String [] args) {
        int roll1 = (int)((Math.random() * 6) + 1);
        int roll2 = (int)((Math.random() * 6) + 1);
        int rollTotal = (roll1 + roll2);
        
        System.out.println("HERE COMES THE DICE!\n");
        System.out.println("Roll #1: " + roll1);
        System.out.println("Roll #2: " + roll2);
        System.out.println("The total is " + rollTotal + "!");
    }
}
