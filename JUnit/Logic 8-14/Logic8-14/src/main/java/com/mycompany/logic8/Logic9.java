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
public class Logic9 {

    public static void main(String[] args) {
        Logic9 kb = new Logic9();
        boolean special = kb.specialEleven(22);
        System.out.print(special);
    }

    public boolean specialEleven(int n) {
        boolean special;

        int isSpecial = n % 11;
        
        if (isSpecial == 0 || isSpecial == 1) {
            special = true;
        } else {
            special = false;
        }

        return special;
    }
}
