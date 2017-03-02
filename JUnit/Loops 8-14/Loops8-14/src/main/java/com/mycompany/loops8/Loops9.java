/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops8;

/**
 *
 * @author apprentice
 */
public class Loops9 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 9, 3, 4};

        Loops9 kb = new Loops9();
        boolean bool = kb.arrayFront9(arr);
        System.out.print(bool);
    }

    public boolean arrayFront9(int[] numbers) {

        boolean bool = false;

        for (int i = 0; i <= 3; i++) {
            if (numbers[i] == 9) {
                bool = true;
            }
        }

        return bool;
    }

}
