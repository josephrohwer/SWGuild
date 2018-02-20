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
public class Logic8 {

    public static void main(String[] args) {
        Logic8 kb = new Logic8();
        boolean range = kb.inRange(5, false);
        System.out.print(range);
    }

    public boolean inRange(int n, boolean outsideMode) {
        boolean range;

        if (n >=1 && n <= 10 && outsideMode) {
            range = false;
        } else if (n >=1 && n <= 10 && outsideMode == false) {
            range = true;
        } else if (n <=1 || n >=10 && outsideMode) {
            range = true;
        } else {
            range = false;
        }

        return range;
    }
}
