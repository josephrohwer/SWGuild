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
public class XsAndYs {

    public static void main(String[] args) {

        double x = -10.0;
        

        System.out.println("X       Y");
        System.out.println("-----------------");
        for (int i = 0; i <= 40; i++) {
            double y = (x * x);
            System.out.println(x + "    " + y );
            x += .5;
        }
    }
}
