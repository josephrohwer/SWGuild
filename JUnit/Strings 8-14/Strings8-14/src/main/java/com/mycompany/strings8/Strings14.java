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
public class Strings14 {

    public static void main(String[] args) {

        Strings14 kb = new Strings14();
        String madeOf = kb.frontAndBack("hello", 2);
        System.out.print(madeOf);
    }

    public String frontAndBack(String str, int n) {

        if (str.length() >= n) {
        String lastTwo = str.substring(str.length() - n);
        String firstTwo = str.substring(0, str.length() - (str.length() - n));
        String madeOf = (firstTwo + lastTwo);
        
        return madeOf;
        }
        return null;
    }
}
