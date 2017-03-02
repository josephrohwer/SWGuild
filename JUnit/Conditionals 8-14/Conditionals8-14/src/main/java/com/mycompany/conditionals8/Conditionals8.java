/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals8;

/**
 *
 * @author josephrohwer
 */
public class Conditionals8 {

    public static void main(String[] args) {
        Conditionals8 kb = new Conditionals8();
        boolean a = kb.posNeg(1, -1, false);
        System.out.print(a);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        boolean c = false;

        if ((a < 0 && b > 0 || a > 0 && b < 0) && negative == false) {
            c = true;
        } else if ((a < 0 && b < 0) && negative == true) {
            c = true;
        }

        return c;
    }
}
