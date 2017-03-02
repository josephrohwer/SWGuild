/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic8;

/**
 *
 * @author josephrohwer
 */
public class Logic10 {

    public static void main(String[] args) {
        Logic10 kb = new Logic10();
        boolean more = kb.mod20(20);
        System.out.print(more);
    }

    public boolean mod20(int n) {
        boolean more = false;

        int isMore = n % 20;
        
        if (isMore == 1 || isMore == 2) {
            more = true;
        }
        
        return more;
    }
}
