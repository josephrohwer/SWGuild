/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.arrays;

import java.util.Scanner;

/**
 *
 * @author mgaffney
 */
public class BasicArrays {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int [] array1 = new int[4];
        
//        for(int i = 0; i < array1.length; i++) {
//            System.out.print("Enter value " + (i+1) + ": ");
//            array1[i] = kb.nextInt();
//        }
//        
//        for (int i  = 0; i < array1.length; i++) {
//            array1[i]++;
//        }
//        
//        for(int i: array1) {
//            System.out.println(i + " ");
//        }
        
        int [][] array2 = new int[4][3];
        
        (array2[1])[2] = 5;
        System.out.println(array2[1][2]);
        
        int [][] array3 = new int[4][];
        
        for(int i = 0; i < array3.length; i++) {
            array3[i] = new int [i+3];
        }
        
        for (int [] i: array3) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
        printArray2D(array2);
        
    }
    
    public static void printArray2D(int [][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
