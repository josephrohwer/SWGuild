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
public class SortingValues {

    public static void main(String[] args) {
        int[] arr = {45, 17, 39, 2, 93, 86, 62, 54, 75, 50};

        // Display the original (unsorted values)
        System.out.print("before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {        
            for (int a = i; a < arr.length; a++) { 
                if (arr[i] > arr[a]) {
                    // swap the values in two slots
                    int temp = arr[i];
                    arr[i] = arr[a];
                    arr[a] = temp;
                }
            }
        }

        // Display the values again, now (hopefully) sorted.
        System.out.print("after : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
