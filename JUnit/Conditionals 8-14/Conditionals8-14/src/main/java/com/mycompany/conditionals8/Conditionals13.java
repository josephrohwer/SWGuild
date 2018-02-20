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
public class Conditionals13 {

    public static void main(String[] args) {
        Conditionals13 kb = new Conditionals13();
        String a = kb.backAround("cat");
        System.out.print(a);
    }

    public String backAround(String str) {
        
        String a = str.substring(str.length() - 1);
        String b = (a + str + a);
        return b;
    }
}
