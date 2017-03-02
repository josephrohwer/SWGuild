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
public class Conditionals10 {

    public static void main(String[] args) {
        Conditionals10 kb = new Conditionals10();
        String a = kb.missingChar("kitten", 1);
        System.out.print(a);
    }

    public String missingChar(String str, int n) {
        
        String a = str.substring(0, n) + str.substring(n + 1);
        return a;
        
    }
}
