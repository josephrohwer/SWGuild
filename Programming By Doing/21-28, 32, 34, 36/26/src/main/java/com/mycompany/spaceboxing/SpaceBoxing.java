/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spaceboxing;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class SpaceBoxing {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        float weight;
        float result = 0;
        int planet;
        float venus = .78f;
        float mars = .39f;
        float jupiter = 2.65f;
        float saturn = 1.17f;
        float uranus = 1.05f;
        float neptune = 1.23f;
        
        System.out.println("Please enter your current Earth weight: ");
        weight = keyboard.nextFloat();
        
        System.out.println("I have information for the following planets:");
        System.out.println("    1. Venus    2. Mars     3. Jupiter");
        System.out.println("    4. Sautrn   5. Uranus   6. Neptune");
        
        do {
            System.out.println("Which planet are you visiting? ");
            planet = keyboard.nextInt();
        } while (planet < 1 || planet > 6);        
        
        switch (planet) {
            case 1:
                result = venus;
                break;
            case 2:
                result = mars;
                break;
            case 3:
                result = jupiter;
                break;
            case 4:
                result = saturn;
                break;
            case 5:
                result = uranus;
                break;
            case 6:
                result = neptune;
                break;
        }
        
        float finalWeight = weight * result;
        
        System.out.println("Your weight would be " + finalWeight + " pounds on that planet.");
    }
}
