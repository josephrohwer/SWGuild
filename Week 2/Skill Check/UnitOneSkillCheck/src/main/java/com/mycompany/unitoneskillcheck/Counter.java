/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unitoneskillcheck;

/**
 *
 * @author apprentice
 */
public class Counter { 
    public static void main(String[] args) {
        toTen();
        
        System.out.println("");
        
        Counter r = new Counter();
        r.toN(10);
    }
    
    public static void toTen() {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x++;
            System.out.println(x);
        }  
    }
    
    public void toN(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println(i);
        }
    }   
}
