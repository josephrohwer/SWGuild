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
public class Conditionals7 {

    public static void main(String[] args) {
        Conditionals7 kb = new Conditionals7();
        boolean bool = kb.nearHundred(103);
        System.out.print(bool);
    }

    public boolean nearHundred(int n) {
        boolean bool;

        if (100 - n <=10 && 100 - n >= 0 || n - 100 <=10 && n - 100 >= 0) {
            bool = true;
        } else if (200 - n <=10 && 200 - n >= 0 || n - 200 <=10 && n - 200 >= 0) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
