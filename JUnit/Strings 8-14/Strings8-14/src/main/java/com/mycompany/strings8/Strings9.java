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
public class Strings9 {

    public static void main(String[] args) {
        Strings9 kb = new Strings9();
        String rotate = kb.rotateLeft2("java");
        System.out.print(rotate);
    }

    public String rotateLeft2(String str) {

        if (str.length() == 2) {
            return str;
        }

        String end = str.substring(2, str.length());
        String firstTwo = str.substring(0, str.length() - (str.length() - 2));
        String rotate = end + firstTwo;

        return rotate;
    }
}
