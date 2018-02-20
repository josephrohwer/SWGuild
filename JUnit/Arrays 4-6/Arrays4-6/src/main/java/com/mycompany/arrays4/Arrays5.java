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
public class Arrays5 {
        public static void main(String[] args) {
        int[] a = {1, 2, 3};
        
        Arrays5 kb = new Arrays5();
        int sum = kb.sum(a);
        System.out.print(sum);
    }

    public int sum(int[] numbers) {
        int sum = 0;
        
        for (int i : numbers) {
            sum += i;
        }
        
        
        return sum;
    }
}
