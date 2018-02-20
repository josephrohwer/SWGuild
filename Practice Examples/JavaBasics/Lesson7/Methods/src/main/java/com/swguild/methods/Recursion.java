/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.methods;

/**
 *
 * @author mgaffney
 */
public class Recursion {
    public static long factorial (long n) {
        if (n < 0) return -1;
        if (n <=1) return 1;
        long ret = n * factorial(n-1);
        return ret;
    }
    
    public static long factIter (long n) {
        if (n < 0) return -1;
        long total = 1;
        for (int i = 2; i <= n; i++) {
            total *= i;
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
