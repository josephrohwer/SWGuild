/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strings5;

/**
 *
 * @author apprentice
 */
public class Strings5 {

    public static void main(String[] args) {
        Strings5 kb = new Strings5();
        String lastTwo = kb.multipleEnding("Hello");
        System.out.print(lastTwo);
    }

    public String multipleEnding(String str) {
        String lastTwo = null;
        if (str != null && str.length() >= 2) {
            lastTwo = str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
        }
        return lastTwo;
    }
}
