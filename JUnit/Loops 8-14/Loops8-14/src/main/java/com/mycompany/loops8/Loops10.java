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
public class Loops10 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 1, 2, 3};

        Loops10 kb = new Loops10();
        boolean bool = kb.array123(arr);
        System.out.print(bool);
    }

    public boolean array123(int[] numbers) {

        boolean bool = false;

        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] == 1) {
                if (numbers[(i+1)] == 2) {
                    if (numbers[(i+2)] == 3) {
                        bool = true;
                    }
                }
            }
        }

        return bool;
    }
}
