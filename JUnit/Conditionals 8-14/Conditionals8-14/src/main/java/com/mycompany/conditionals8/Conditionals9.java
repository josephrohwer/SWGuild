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
public class Conditionals9 {

    public static void main(String[] args) {
        Conditionals9 kb = new Conditionals9();
        String a = kb.notString("candy");
        System.out.print(a);
    }

    public String notString(String s) {
        String temp = "";
        
        if (s.length() > 3) {
        temp = s.substring(0, s.length() - (s.length() - 3));
        }
        
        if (temp.equals("not")) {
            return s;
        } else {
            String c = ("not " + s);
            return c;
        }
    }
}
