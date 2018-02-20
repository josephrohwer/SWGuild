/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.methods;

/**
 *
 * @author mgaffney
 */
public class Maths {
    public int power (int base, int power) {
        int pow = 1;
        for (int i = 0; i < power; i++) {
            pow *= base;
        }
        return pow;
    }
}
