/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays7;

/**
 *
 * @author josephrohwer
 */
public class Arrays8 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        Arrays8 kb = new Arrays8();
        int[] b = kb.higherWins(a);
        System.out.print(java.util.Arrays.toString(b));
    }

    public int[] higherWins(int[] numbers) {
        int temp = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > temp) {
                temp = numbers[i];
            }
        }

        int[] newNumbers;
        newNumbers = new int[3];
        for (int i = 0; i < newNumbers.length; i++) {
            newNumbers[i] = temp;
        }

        return newNumbers;
    }
}
