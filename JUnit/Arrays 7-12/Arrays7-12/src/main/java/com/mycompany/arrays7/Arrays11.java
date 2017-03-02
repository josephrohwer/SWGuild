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
public class Arrays11 {

    public static void main(String[] args) {
        int[] a = {4, 5, 6};

        Arrays11 kb = new Arrays11();
        int[] b = kb.keepLast(a);
        System.out.print(b);
    }

    public int[] keepLast(int[] numbers) {

        int length = (numbers.length * 2);
        int lastNum = numbers[numbers.length - 1];
        
        int[] doubleLength;
        doubleLength = new int[length];
        doubleLength[doubleLength.length -1 ] = lastNum;
        return doubleLength;
    }
}
