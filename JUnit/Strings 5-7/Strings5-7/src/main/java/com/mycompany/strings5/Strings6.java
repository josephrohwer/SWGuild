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
public class Strings6 {

    public static void main(String[] args) {
        Strings6 kb = new Strings6();
        String half = kb.firstHalf("helloHELLO");
        System.out.print(half);
    }

    public String firstHalf(String str) {
        String firstHalf = null;
        if (str != null) {
            firstHalf = str.substring(0, str.length() / 2);
        }
        return firstHalf;
    }
}
