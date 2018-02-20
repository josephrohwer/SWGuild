/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bmicategories;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class BMICategories {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        float mass;
        float height;
    
        System.out.println("Your height in m: ");
        height = keyboard.nextFloat();
        
        System.out.println("Your weight in kg: ");
        mass = keyboard.nextFloat();
    
        float bmi = mass / (height * height);
    
        System.out.println("Your BMI is " + bmi);
    
        if (bmi < 18.5) {
            System.out.println("BMI Category: underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI Category: normal weight");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("BMI Category: overweight");
        }
        else if (bmi >= 30) {
            System.out.println("BMI Category: obese");
        }
    }
}
