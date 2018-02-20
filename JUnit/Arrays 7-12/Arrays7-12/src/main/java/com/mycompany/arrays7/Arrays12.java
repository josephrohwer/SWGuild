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
public class Arrays12 {

    public static void main(String[] args) {
        int[] a = {2, 2, 3};

        Arrays12 kb = new Arrays12();
        boolean b = kb.double23(a);
        System.out.print(b);
    }

    public boolean double23(int[] numbers) {
        int total2 = 0;
        int total3 = 0;
        int temp = 0;
        boolean b = false;
        
        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            if (temp == 2) {
                total2++;
            } else if (temp == 3) {
                total3++;
            }
        }
        
        if (total2 == 2 || total3 == 2) {
            b = true;
        }
        return b;
    }
}
