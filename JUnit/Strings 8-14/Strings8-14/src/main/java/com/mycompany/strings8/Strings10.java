/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strings8;

/**
 *
 * @author apprentice
 */
public class Strings10 {

    public static void main(String[] args) {
        Strings10 kb = new Strings10();
        String rotateRight = kb.rotateRight2("hello");
        System.out.print(rotateRight);
    }

    public String rotateRight2(String str) {

        if (str.length() == 2) {
            return str;
        }

        String beginning = str.substring(0, str.length() - 2);
        String lastTwo = str.substring(str.length() - 2);
        String rotateRight = (lastTwo+ beginning);

        return rotateRight;
    }
}
