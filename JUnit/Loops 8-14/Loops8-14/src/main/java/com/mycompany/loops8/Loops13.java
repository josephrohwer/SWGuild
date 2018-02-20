/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops8;

/**
 *
 * @author apprentice
 */
public class Loops13 {

    public static void main(String[] args) {
        Loops13 kb = new Loops13();
        String charAt = kb.altPairs("chocolate");
        System.out.print(charAt);
    }

    public String altPairs(String str) {
        StringBuilder charAt = new StringBuilder(str);

        for (int i = 2; i < charAt.length(); i += 2) {
            charAt.deleteCharAt(i);
            if (i < charAt.length()) {
                charAt.deleteCharAt(i);
            }
        }

        String result = charAt.toString();

        return result;
    }
}
