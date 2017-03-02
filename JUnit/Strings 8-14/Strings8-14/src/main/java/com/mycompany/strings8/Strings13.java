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
public class Strings13 {

    public static void main(String[] args) {

        Strings13 kb = new Strings13();
        boolean endsIn = kb.endsWithLy("oddly");
        System.out.print(endsIn);
    }

    public boolean endsWithLy(String str) {

        boolean bool = false;
        String ly = "ly";

        if (str.length() >= 2) {
            String lastTwo = str.substring(str.length() - 2);
            if (ly.equals(lastTwo)) {
                bool = true;
            }
        }
        return bool;
    }
}
