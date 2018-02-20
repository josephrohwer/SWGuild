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
public class Logic12 {

    public static void main(String[] args) {
        Logic12 kb = new Logic12();
        boolean a = kb.answerCell(false, false, false);
        System.out.print(a);
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean a;

        if (isMorning == true && isMom == true && isAsleep == false) {
            a = true;
        } else if (isMorning == false && isMom == true && isAsleep == false) {
            a = true;
        } else if (isMorning == false && isMom == false && isAsleep == false) {
            a = true;
        } else {
            a = false;
        }

        return a;
    }
}
