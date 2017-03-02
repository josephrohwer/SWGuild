/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays4;

/**
 *
 * @author apprentice
 */
public class Arrays6 {

    public static void main(String[] args) {
        int[] a = {5, 11, 9};

        Arrays6 kb = new Arrays6();
        int[] left = kb.rotateLeft(a);
        System.out.println(java.util.Arrays.toString(left));
    }

    public int[] rotateLeft(int[] numbers) {

        for (int i = 0, start = 0; i < numbers.length; i++) {
            if (i == 0) {
                start = numbers[i];
            }
            if (i == (numbers.length - 1)) {
                numbers[i] = start;
                break;
            }
            numbers[i] = numbers[i + 1];
        }
        return numbers;

  
    }
}
