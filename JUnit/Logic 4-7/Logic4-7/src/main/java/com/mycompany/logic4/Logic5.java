/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic4;

/**
 *
 * @author apprentice
 */
public class Logic5 {

    public static void main(String[] args) {
        Logic5 kb = new Logic5();
        int sum = kb.skipSum(9, 4);
        System.out.print(sum);
    }

    public int skipSum(int x, int y) {
        
        int min = 10;
        int max =19;
        int sum = (x + y);

        if (x + y > max) {
            return sum;
        } else if (x + y < min) {
            return sum;
        } else {
            return 20;
        }
    }
}
