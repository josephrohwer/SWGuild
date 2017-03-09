/*
Write a program that asks the user for two ints and calculates 
and outputs the sum of those two numbers and all integers in between them.  
So if the user enters -2 and 6 the result would be 
-2 +-1 + 0 + 1 + 2 + 3 + 4 + 5 + 6, or 18.
 */
package com.swguild.warmups;

import java.util.Scanner;

/**
 *
 * @author mgaffney
 */
public class September16 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int in1, in2, total = 0;
        System.out.print("Please enter two ints: ");
        in1 = kb.nextInt();
        in2 = kb.nextInt();
        
        if (in2 < in1) {
            int temp = in1;
            in1 = in2;
            in2 = temp;
        }
        
        for (int i = in1; i <= in2; i++) {
            total += i;
        }
        
        System.out.println("The sum of the integers from " + in1 + " to " + in2 + " is " + total + ".");
        
    }
}
