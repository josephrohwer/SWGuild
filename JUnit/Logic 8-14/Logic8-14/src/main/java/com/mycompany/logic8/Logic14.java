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
public class Logic14 {

    public static void main(String[] args) {
        Logic13 kb = new Logic13();
        boolean a = kb.twoIsOne(1, 2, 3);
        System.out.print(a);
    }

    public boolean areInOrder(int a, int b, int c, boolean b0k) {
        boolean d = false;

        if (b > a && c > b && b0k == false) {
            d = true;
        } else if (c > b && b0k == true) {
            d = true;
        }

        return d;
    }
}
