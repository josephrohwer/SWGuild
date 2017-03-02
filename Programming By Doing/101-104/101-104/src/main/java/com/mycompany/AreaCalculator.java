/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AreaCalculator {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int shape;
        int radius;
        int length;
        int width;
        int side;
        int base;
        int height;

        System.out.println("AREA CALCULATOR\n");
        System.out.println("1) Triangle\n"
                + "2) Rectangle\n"
                + "3) Square\n"
                + "4) Circle\n"
                + "5) Quit");

        do {
            System.out.print("Which shape: ");
            shape = kb.nextInt();
            System.out.println("");
            if (shape == 1) {
                System.out.print("Base: ");
                base = kb.nextInt();
                System.out.print("Height: ");
                height = kb.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_triangle(base, height));
                System.out.println("");
            } else if (shape == 2) {
                System.out.print("Length: ");
                length = kb.nextInt();
                System.out.print("Width: ");
                width = kb.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_rectangle(length, width));
                System.out.println("");
            } else if (shape == 3) {
                System.out.print("Side length: ");
                side = kb.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_square(side));
                System.out.println("");
            } else if (shape == 4) {
                System.out.print("Radius: ");
                radius = kb.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_circle(radius));
                System.out.println("");
            }
        } while (shape > 5 || shape < 0 || shape != 5);

        System.out.println("Goodbye.");

    }

    public static double area_circle(int radius) {
        double circleArea = (radius * radius * 3.14);
        return circleArea;
    }

    public static int area_rectangle(int length, int width) {
        int rectangleArea = (length * width);
        return rectangleArea;
    }

    public static int area_square(int side) {
        int squareArea = (side * side);
        return squareArea;
    }

    public static double area_triangle(int base, int height) {
        double triangleArea = (.5 * base * height);
        return triangleArea;
    }
}
