/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swggaffney.llamasandstreams;

/**
 *
 * @author mgaffney
 */
public class SimpleLlama {

    public static double sum(double x, double y, double step, DoubleDouble meth) {
        double total = 0;
        for (double i = x; i <= y; i += step) {
            total += meth.method(i);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 10, 1, new DDImple()));

        System.out.println(sum(1, 10, 1, new DoubleDouble() {
            public double method(double in) {
                double a = in * 3;
                return a;

            }
        }));
        
        System.out.println(sum(1, 10, 1, (double in) -> {
            double a = in * 3;
            return a;
        }));
        
        //one line methods do not need the return statement
        System.out.println(sum(1, 10, 1, 
                (d) -> d*4)
                );

    }

    static class DDImple implements DoubleDouble {

        public double method(double in) {
            return in * 2;

        }
    }
}

interface DoubleDouble {

    double method(double in);
}
