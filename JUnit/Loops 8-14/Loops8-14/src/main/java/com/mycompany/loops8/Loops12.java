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
public class Loops12 {

    public static void main(String[] args) {
        Loops12 kb = new Loops12();
        String removeX = kb.stringX("abxxxcd");
        System.out.print(removeX);
    }

    public String stringX(String str) {

        String beginningX = str.substring(0, str.length() - (str.length() - 1));
        String endX = str.substring(str.length() - 1);
        String result = str;
        String removeX = str.replace("x", "");
        
        if (beginningX.equals("x") && endX.equals("x")) {
            result = beginningX + removeX + endX;
        } else if (beginningX.equals("x")) {
            result = beginningX + removeX;
        } else if (endX.equals("x")) {
            result = removeX + endX;
        } else {
            return removeX;
        }
        
        return result;
    }
}
