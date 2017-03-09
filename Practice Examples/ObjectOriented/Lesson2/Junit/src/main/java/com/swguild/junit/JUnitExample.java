/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.junit;

/**
 *
 * @author mgaffney
 */
public class JUnitExample {
    public String method1(String s) {
        String s1 = s.substring(0, s.length() -1).toUpperCase();
        s1 += s.substring(s.length() -1).toLowerCase();
        return s1;
    }
}
