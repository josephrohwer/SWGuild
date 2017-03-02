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
public class Conditionals5 {

    public static void main(String[] args) {
        Conditionals5 kb = new Conditionals5();
        boolean bool = kb.parrotTrouble(true, 7);
        System.out.print(bool);
    }

    public boolean parrotTrouble(boolean isTalking, int hour) {
        boolean bool = true;

        if (isTalking == false) {
            if (hour < 7 || hour > 20) {
                bool = false;
            }
        } else if (isTalking == true) {
            if (hour < 7 || hour > 20) {
                bool = true;
            } else {
                bool = false;
            }
        }
                 
    return bool ;
    }
}
