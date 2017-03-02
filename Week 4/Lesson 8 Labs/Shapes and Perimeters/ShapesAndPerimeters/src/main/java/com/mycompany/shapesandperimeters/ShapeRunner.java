/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shapesandperimeters;

/**
 *
 * @author josephrohwer
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Square sq = new Square(5);
        System.out.println("SQUARE");
        System.out.println("Area: " + sq.area());
        System.out.println("Perimeter: " + sq.perimeter());

        Triangle tr = new Triangle(7, 4);
        System.out.println("\nTRIANGLE");
        System.out.println("Area: " + tr.area());
        System.out.println("Perimeter: " + tr.perimeter());
        
        Rectangle re = new Rectangle(12, 6);
        System.out.println("\nRECTANGLE");
        System.out.println("Area: " + re.area());
        System.out.println("Perimeter: " + re.perimeter());
        
        Circle ci = new Circle(9);
        System.out.println("\nCircle");
        System.out.println("Area: " + ci.area());
        System.out.println("Perimeter: " + ci.perimeter());
    }
}
