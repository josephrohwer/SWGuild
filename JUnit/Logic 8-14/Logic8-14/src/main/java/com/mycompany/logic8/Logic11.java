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
public class Logic11 {

    public static void main(String[] args) {
        Logic11 kb = new Logic11();
        boolean a = kb.mod35(3);
        System.out.print(a);
    }

    public boolean mod35(int n) {
        boolean a = false;

        if (n % 3 == 0 || n % 5 == 0) {
            a = true;
        }
        
        if (n % 3 == 0 && n % 5 == 0) {
            a = false;
        }

        return a;
    }
}
