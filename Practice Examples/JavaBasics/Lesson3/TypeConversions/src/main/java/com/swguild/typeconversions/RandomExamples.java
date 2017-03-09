/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.typeconversions;
import java.util.Random;
/**
 *
 * @author mgaffney
 */
public class RandomExamples {
    
    public static void main(String[] args) {
        Random rnd = new Random();
        
        System.out.println("Print 10 random ints from the full int range");
        for (int i = 0; i < 10; i++) {
            System.out.println(rnd.nextInt());
        }
        
        System.out.println("Print 10 random doubles between 0 and 1, exclusive of 1.");
        for (int i = 0; i < 10; i++) {
            System.out.println(rnd.nextDouble());
        }
        
        System.out.println("Print 100 random ints between 0 and 9, inclusive.");
        
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            System.out.print(rnd.nextInt(10) + " ");
            
        }
        
        System.out.println("Print 100 random ints between 1 and 10, inclusive.");
        
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            System.out.print(rnd.nextInt(10) + 1 + " ");
            
        }
    }
    
    
    
    
}
