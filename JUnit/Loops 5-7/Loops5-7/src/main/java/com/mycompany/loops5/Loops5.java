/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops5;

/**
 *
 * @author apprentice
 */
public class Loops5 {

    public static void main(String[] args) {
        Loops5 kb = new Loops5();
        String eOther = kb.everyOther("Heeololeo");
        System.out.print(eOther);
    }

    public String everyOther(String str) {
        String eOther = "";
        for (int i = 0; i < str.length(); i += 2) {
            eOther += str.charAt(i);
        }
        return eOther;
    }
}
