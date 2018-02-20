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
public class Loops6 {

    public static void main(String[] args) {
        Loops6 kb = new Loops6();
        String splosion = kb.stringSplosion("Code");
        System.out.print(splosion);
    }

    public String stringSplosion(String str) {
        String splosion = "";

        for (int i = 0; i <= str.length(); i++) {
            splosion += str.substring(0, i);
        }

        return splosion;
    }
}
