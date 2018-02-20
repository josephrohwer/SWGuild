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
public class Strings8 {
    public static void main(String[] args) {
        Strings8 kb = new Strings8();
        String middle = kb.longInMiddle("hello", "hi");
        System.out.print(middle);
    }
    
    public String longInMiddle(String a, String b) {
        String middle = "";
        if (a.length() > b.length()) {
            return middle = (b + a + b);
        } else if (b.length() > a.length()) {
            return middle = (a + b + a);
        }
            return null;
    }
}