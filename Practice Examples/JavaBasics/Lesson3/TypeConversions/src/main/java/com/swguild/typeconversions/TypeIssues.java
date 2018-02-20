/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.typeconversions;

/**
 *
 * @author mgaffney
 */
public class TypeIssues {
    
    public static void main(String[] args) {
        int a = 8, 
            b = 10, 
            c;
        
        System.out.println(a + " / " + b + " = " + a / b);
        // 8 / 10 = 0 -- integer division truncates
        System.out.println(2000000000 + 500000000);
        // -1794967296 -- int + int evaluates to int, which overflows
        System.out.println(a + " / " + b + " = " + (double)a / b);
        //double cast causes division to be of two doubles
        System.out.println(2000000000l + 500000000);
        //one long literal promotes the int to long and results in a long
        System.out.println("Double div by 0: " + 2.5 / 0);
        //Infinity -- no error, but will result in Infinity with other operations
        System.out.println("0.0 / 0.0: " + 0.0 / 0.0);
        //NaN - not a number
        //System.out.println("0.0 / 0.0: " + 0 / 0);
        //Division by zer ArithmeticException
        System.out.println("3.14 + 4 == 7.14 is " + (3.14 + 4 == 7.14));
        //equality tests for doubles/floats are dangerous due to rounding/precision issues
        double x = 3.14, y = 4, z = x + y;
        System.out.printf("x = %.17f, y = %.17f, z = %.17f\n", x, y, z);
        
        
    }
    
}
