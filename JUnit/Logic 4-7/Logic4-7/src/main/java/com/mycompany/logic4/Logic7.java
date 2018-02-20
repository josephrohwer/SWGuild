/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic4;

/**
 *
 * @author apprentice
 */
public class Logic7 {

    public static void main(String[] args) {
        Logic7 kb = new Logic7();
        boolean six = kb.loveSix(1, 5);
        System.out.print(six);
    }

    public boolean loveSix(int a, int b) {

        boolean six;

        if (a == 6 || b == 6) {
            six = true;
        } else if ((a - b == 6) || (b - a == 6 || (a + b == 6))) {
            six = true;
        } else {
            six = false;
        }
        return six;
    }
}
