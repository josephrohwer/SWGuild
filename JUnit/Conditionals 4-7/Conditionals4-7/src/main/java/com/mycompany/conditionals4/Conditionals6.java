/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals4;

/**
 *
 * @author apprentice
 */
public class Conditionals6 {

    public static void main(String[] args) {
        Conditionals6 kb = new Conditionals6();
        boolean bool = kb.makes10(9, 10);
        System.out.print(bool);
    }

    public boolean makes10(int a, int b) {
        boolean bool;

        if (a == 10  || b == 10 || (a + b == 10)) {
            bool = true;
        } else {
            bool = false;
        }

        return bool;
    }
}
