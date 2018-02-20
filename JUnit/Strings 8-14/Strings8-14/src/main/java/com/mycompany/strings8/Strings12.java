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
public class Strings12 {
        public static void main(String[] args) {

        Strings12 kb = new Strings12();
        String middle = kb.middleTwo("string");

        System.out.print(middle);
    }

    public String middleTwo(String str) {
        
        if (str.length() == 2) {
            return str;
        }
        
        String first = str.substring(0, str.length() / 2);
        String temp1 = first.substring(first.length() - 1);
        
        String last = str.substring(str.length() / 2);
        String temp2 = last.substring(0, str.length() - (str.length() - 1));
        
        String middle = (temp1 + temp2);
        
        return middle;
    }
}
