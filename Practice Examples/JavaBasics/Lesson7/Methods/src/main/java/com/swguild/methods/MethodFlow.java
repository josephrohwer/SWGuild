/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.methods;

import java.util.Scanner;

/**
 *
 * @author mgaffney
 */
public class MethodFlow {
    
//    public static int power (int base, int power) {
//        int pow = 1;
//        for (int i = 0; i < power; i++) {
//            pow *= base;
//        }
//        return pow;
//    }
    
    public static void main(String [] args) {
        int base, pow, result;
        Maths ops = new Maths();
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your base: ");
        base = kb.nextInt();
        System.out.print("Enter your power: ");
        pow = kb.nextInt();
        result = ops.power(base, pow);
        System.out.println(base + " ^ " + pow + " = " + result);
    }
}
