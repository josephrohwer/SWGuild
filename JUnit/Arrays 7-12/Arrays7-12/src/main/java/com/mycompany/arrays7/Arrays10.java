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
public class Arrays10 {

    public static void main(String[] args) {
        int[] a = {2, 5};

        Arrays10 kb = new Arrays10();
        boolean b = kb.hasEven(a);
        System.out.print(b);
    }

    public boolean hasEven(int[] numbers) {

        boolean b = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                b = true;
            }
        }
        
        
        return b;
    }
}
