/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops8;

/**
 *
 * @author josephrohwer
 */
public class Loops14 {

    public static void main(String[] args) {
        Loops14 kb = new Loops14();
        String noYak = kb.doNotYak("yakpak");
        System.out.print(noYak);
    }

    public String doNotYak(String str) {
        String noYak = str;
        
        noYak = noYak.replace("yak", "");
        
        return noYak;
    }
}
