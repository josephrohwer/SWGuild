/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays4;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class Arrays4 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
      
        Arrays4 kb = new Arrays4();
        boolean bool = kb.commonEnd(a, b);
        System.out.print(bool);
    }

    public boolean commonEnd(int[] a, int [] b) {
        boolean bool;

        int xLast = a[a.length -1];
        int yLast = b[b.length-1];
        
        int xFirst = a[0];
        int yFirst = b[0];
        
        if (xLast == yLast || xFirst == yFirst) {
            bool = true;
        } else {
            bool = false;
        }
        
        return bool;
    }
}
