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
public class Conditionals12 {
        public static void main(String[] args) {
        Conditionals12 kb = new Conditionals12();
        String a = kb.front3("microsoft");
        System.out.print(a);
    }

    public String front3(String str) {

        if (str.length() <= 2) {
            return (str + str + str);
        }
        
        String a = str.substring(0, str.length() - (str.length() - 3));
        return (a + a + a);
    }
}
