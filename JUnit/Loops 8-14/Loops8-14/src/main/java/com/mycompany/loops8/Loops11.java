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
public class Loops11 {

    public static void main(String[] args) {
        Loops11 kb = new Loops11();
        int numTimes = kb.subStringMatch("xxcaazz", "xxbaaz");
        System.out.print(numTimes);
    }

    public int subStringMatch(String a, String b) {

        int numTimes = 0;
        int length;
        
        if (a.length() > b.length()) {
            length = b.length();
        } else if (b.length() > a.length()) {
            length = a.length();
        } else {
            length = a.length();
        }
        
        for (int i = 0; i < length - 1; i++) {
            String tempA = a.substring(i, a.length() - (a.length() - (i + 2)));
            String tempB = b.substring(i, b.length() - (b.length() - (i + 2)));
            
            if (tempA.equals(tempB)) {
                numTimes +=1;
            }
        }

        return numTimes;
    }
}
