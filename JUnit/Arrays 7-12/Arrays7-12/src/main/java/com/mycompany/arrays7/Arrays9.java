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
public class Arrays9 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        Arrays9 kb = new Arrays9();
        int[] c = kb.getMiddle(a, b);
        System.out.print(java.util.Arrays.toString(c));
    }

    public int[] getMiddle(int[] a, int[] b) {

        int temp = a[1];
        int temp2 = b[1];

        int[] newNumbers;
        newNumbers = new int[2];
        newNumbers[0] = temp;
        newNumbers[1] = temp2;

        return newNumbers;
    }
}
