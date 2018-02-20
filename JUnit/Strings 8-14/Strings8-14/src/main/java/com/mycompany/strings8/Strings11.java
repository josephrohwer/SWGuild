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
public class Strings11 {

    public static void main(String[] args) {

        Strings11 kb = new Strings11();
        String one = kb.takeOne("hello", true);

        System.out.print(one);
    }

    public String takeOne(String str, boolean fromFront) {

        if (fromFront == true) {
            String first = str.substring(0, str.length() - (str.length() - 1));
            return first;
        } else {
            String last = str.substring(str.length() - 1);
            return last;
        }
    }
}
