/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.mavenproject1;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author mgaffney
 */
public class Interfaces {

    public static void main(String[] args) {
        Drawable d = new Line(0, 0, 5, 6);
        Line l = new Line(1, 5, 4, 5);

        System.out.println(l.length());
        if (d instanceof Line) {
            System.out.println(((Line) d).length());
        }

        if (d.getClass().getName().equals("Line")) {
            Line l2 = (Line) d;
            System.out.println(l2.length());
        }
        System.out.println("d: " + ((Line) d).length());
        System.out.println("l: " + l.length());
        Line[] lines = new Line[2];
        lines[0] = (Line) d;
        lines[1] = l;
        //using an inner class
        Arrays.sort(lines, new LineLengthComp());
        System.out.println(lines[0].length() + " " + lines[1].length());
        
        //using an anonymous class -- the implementation of the required interface is done inline with the method call
        Arrays.sort(lines, new Comparator<Line>() {
            @Override
            public int compare(Line o1, Line o2) {
                double length1 = o1.length();
                double length2 = o2.length();
                if ((length1 > length2 ? length1 / length2 : length2 / length1) < 1.000000001) {
                    return 0;
                }
                if (length1 > length2) {
                    return 1;
                }
                return -1;
            }

        }
        );

    }

    public static class LineLengthComp implements Comparator<Line> {

        @Override
        public int compare(Line o1, Line o2) {
            double length1 = o1.length();
            double length2 = o2.length();
            if ((length1 > length2 ? length1 / length2 : length2 / length1) < 1.000000001) {
                return 0;
            }
            if (length1 > length2) {
                return 1;
            }
            return -1;
        }

    }
}
