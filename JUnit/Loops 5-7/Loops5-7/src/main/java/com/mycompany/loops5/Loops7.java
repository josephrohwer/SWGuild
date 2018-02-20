/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loops5;

/**
 *
 * @author apprentice
 */
public class Loops7 {

    public static void main(String[] args) {

        Loops7 kb = new Loops7();
        int count = kb.countLast2("axxxaaxx");
        System.out.print(count);
    }

    public int countLast2(String str) {

        
        String firstHalfx = str.substring(str.length() -2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i ++) {
                    String firstHalfy = str.substring(i, str.length() - (str.length() - (i + 2)));
                    
                    if (firstHalfy.equals(firstHalfx)) {
                        count++;
                    }
        }
        return count;
    }
}
