/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops8;

/**
 *
 * @author apprentice
 */
public class Loops8 {

    public static void main(String[] args) {

        int[] arr = new int[] {9, 9, 9};
        
        Loops8 kb = new Loops8();
        int nineCount = kb.count9(arr);
        System.out.print(nineCount);
    }

    public int count9(int[] numbers) {

        int nineCount = 0;
        
        for (int d : numbers) {
            if (d == 9) {
                nineCount += 1;
            }
        }
        
        
        return nineCount;        
    }
}
