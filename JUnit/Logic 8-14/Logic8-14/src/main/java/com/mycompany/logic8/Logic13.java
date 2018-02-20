/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic8;

/**
 *
 * @author josephrohwer
 */
public class Logic13 {

    public static void main(String[] args) {
        Logic13 kb = new Logic13();
        boolean a = kb.twoIsOne(1, 2, 3);
        System.out.print(a);
    }

    public boolean twoIsOne(int a, int b, int c) {
        boolean d = false;

        if (a + b == c || a + c == b || b + a == c || b + c == a) {
            d = true;
        }

        return d;
    }
}
