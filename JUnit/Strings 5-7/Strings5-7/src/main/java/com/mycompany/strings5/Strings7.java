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
public class Strings7 {
    
    public static void main(String[] args) {
        Strings7 kb = new Strings7();
        String middle = kb.trimOne("Hello");
        System.out.print(middle);
    }

    public String trimOne(String str) {
        String middle = null;
        if (str != null && str.length() >= 2) {
            middle = str.substring(1, str.length() - 1);
        }
        return middle;
    }
}
