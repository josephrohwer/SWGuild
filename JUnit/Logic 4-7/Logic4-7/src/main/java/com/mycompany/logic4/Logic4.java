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
public class Logic4 {

    public static void main(String[] args) {
        Logic4 kb = new Logic4();
        int speeding = kb.caughtSpeeding(65, true);
        System.out.print(speeding);
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {

        int ticket = 0;
        
        if (isBirthday == false) {
            if (speed <= 60) {
                ticket = 0;
            } else if (speed > 60 && speed <= 80) {
                ticket = 1;
            } else if (speed > 80) {
                ticket = 2;
            }
        } else if (isBirthday == true) {
            if (speed <= 65) {
                ticket = 0;
            } else if (speed > 65 && speed <= 85) {
                ticket = 1;
            } else if (speed > 85) {
                ticket = 2;
            }
        }
        
        return ticket;
    }
}