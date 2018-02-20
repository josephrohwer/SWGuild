/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals4;

/**
 *
 * @author apprentice
 */
public class Conditionals4 {

    public static void main(String[] args) {
        Conditionals4 kb = new Conditionals4();
        int diff = kb.diff21(21);
        System.out.print(diff);
    }

    public int diff21(int n) {
        
        int diff = (n - 21);
        
        if (n <= 21) {
            if (diff < 0) {
                diff = (diff * -1);
            }
        } else if (n > 21) {
            diff = diff * 2;
        }
        return diff;
    }
}
