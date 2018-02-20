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
public class CopyingArrays {

    public static void main(String[] args) {
        
        int[] copy;
        copy = new int[10];
        
        for (int i =0; i < copy.length; i++) {
            copy[i] = (int)(Math.random() * 100) + 1;
       }
        
       int copy1[] = copy.clone();
       
       System.out.print("Array 1: ");
        for (int i = 0; i < copy.length - 1; i++) {
            System.out.print(copy[i] + ", ");
        }
        copy[9] = -7;
        System.out.println(copy[9]);

        System.out.print("Array 2: ");
        for (int i = 0; i < copy1.length - 1; i++) {
            System.out.print(copy1[i] + ", ");
        }
        System.out.println(copy1[9]);

    }
}
