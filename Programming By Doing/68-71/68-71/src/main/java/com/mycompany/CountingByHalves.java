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
public class CountingByHalves {

    public static void main(String[] args) {

        double x = -10.0;

        System.out.println("X");
        System.out.println("------");
        for (int i = 0; i <= 40; i++) {
            System.out.println(x);
            x += .5;
        }
    }
}
