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
public class WhatIsYourNumber {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Please give me an integer: ");
        int x = kb.nextInt();
        System.out.println(x + "\n");
        
        for (int i = 0; i <= x; i++) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("Thank you for playing");
    }
}
