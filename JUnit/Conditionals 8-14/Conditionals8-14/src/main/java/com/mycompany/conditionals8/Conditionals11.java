/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals8;

/**
 *
 * @author josephrohwer
 */
public class Conditionals11 {

    public static void main(String[] args) {
        Conditionals11 kb = new Conditionals11();
        String a = kb.frontBack("code");
        System.out.print(a);
    }

    public String frontBack(String str) {

        if (str.length() > 1) {
            String a = str.substring(0, str.length() - (str.length() - 1));
            String b = str.substring(str.length() - 1);
            String c = str.substring(1, str.length() - 1);
            String d = (b + c + a);
            return d;
        }

        return str;
    }
}
