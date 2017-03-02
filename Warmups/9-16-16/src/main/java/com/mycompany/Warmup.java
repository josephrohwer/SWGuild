/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Warmup {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int one;
        int two;
        int total = 0;
        
        System.out.println("Please give me an integer: ");
        one = keyboard.nextInt();
        
        System.out.println("Please give me another integer: ");
        two = keyboard.nextInt();
        
        if (two < one) {
            int temp = one;
            one = two;
            two = temp;
        }
        
        for(int i = one; i <= two; i++ ) {
            total += i;
        }
        
        System.out.println(total);
    }
}