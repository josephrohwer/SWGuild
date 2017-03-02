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
public class Conditionals14 {

    public static void main(String[] args) {
        Conditionals14 kb = new Conditionals14();
        boolean a = kb.multiple3or5(3);
        System.out.print(a);
    }

    public boolean multiple3or5(int number) {
    boolean a = false;
        if (number % 3 == 0 || number % 5 == 0) {
            a = true;
        }
    return a;
    }
}
