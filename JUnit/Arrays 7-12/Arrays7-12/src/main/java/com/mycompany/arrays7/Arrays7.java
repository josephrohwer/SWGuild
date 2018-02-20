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
public class Arrays7 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        Arrays7 kb = new Arrays7();
        int[] b = kb.reverse(a);
        System.out.print(java.util.Arrays.toString(b));
    }

    public int[] reverse(int[] numbers) {
        int temp;

        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[2 - i];
            numbers[2 - i] = temp;
        }
        return numbers;
    }
}
