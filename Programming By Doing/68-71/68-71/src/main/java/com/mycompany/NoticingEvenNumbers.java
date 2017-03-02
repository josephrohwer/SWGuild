/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author apprentice
 */
public class NoticingEvenNumbers {
    public static void main(String[] args) {
        
        
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i +" <");
            } else {
                System.out.println(i);
            }
        }
    }
}
