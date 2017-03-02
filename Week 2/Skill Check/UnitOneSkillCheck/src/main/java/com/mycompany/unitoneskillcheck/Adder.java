/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unitoneskillcheck;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Adder {
    
    static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        int number1;
        int number2;
        
        System.out.println("Enter a number: ");
        number1 = kb.nextInt();
        
        System.out.println("Enter another number: ");
        number2 = kb.nextInt();
        
        int sum = add(number1, number2);
        System.out.println("The sum of the two numbers is " + sum);
    }
    
    public static int add(int x, int y) {
        return (x + y);
    }
    
}

