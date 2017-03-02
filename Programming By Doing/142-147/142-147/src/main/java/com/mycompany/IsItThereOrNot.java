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
public class IsItThereOrNot {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int findValue;
        int numTimes = 0;
        int value[];
        value = new int[10];

        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * (50) + 1);
        }

        System.out.print("Array: ");
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }

        System.out.println("");
        System.out.print("Value to find: ");
        findValue = kb.nextInt();
        System.out.println("");

        for (int i = 0; i < value.length; i++) {
            int temp = value[i];
            if (temp == findValue) {
                System.out.println(findValue + " is in the array.");
                numTimes++;
            }
        }

        if (numTimes == 0) {
            System.out.println(findValue + " is not in the array.");
        }
    }
}
