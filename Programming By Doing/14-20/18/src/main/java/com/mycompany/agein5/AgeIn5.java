/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agein5;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class AgeIn5 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Hello. What is your name? ");
        name = keyboard.next();
        
        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();
        
        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
