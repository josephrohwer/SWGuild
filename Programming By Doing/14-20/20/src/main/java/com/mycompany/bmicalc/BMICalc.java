/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bmicalc;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class BMICalc {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        float mass;
        float height;
        
        System.out.println("Your height in m: ");
        height = keyboard.nextFloat();
        
        System.out.println("Your weight in kg: ");
        mass = keyboard.nextFloat();
        
        System.out.println("Your BMI is " + (mass / (height * height)));
        
    }
}
