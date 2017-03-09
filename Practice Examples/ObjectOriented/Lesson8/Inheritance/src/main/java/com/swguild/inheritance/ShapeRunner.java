/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.inheritance;

/**
 *
 * @author mgaffney
 */
public class ShapeRunner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,5,new Point(2,2));
        Square s1 = new Square(6, "Red", new Point(5, 10));
        System.out.println(r1);
        System.out.println(s1);
        Rectangle r2 = new Rectangle(s1);
        System.out.println(r2);
        s1.getCenter().setX(7);
        System.out.println("");
        System.out.println(s1);
        System.out.println(r2);
        Rectangle r10 = new Square(10, "Blue", new Point(2, 3));
        Rectangle r3 = new Rectangle(r1);
        Rectangle r4 = r1.clone();
        Rectangle r5 = new Rectangle(r10);
        Rectangle r6 = r10.clone();
        
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        
        System.out.println("");
        System.out.println(r5.equals(r10));
        System.out.println((r10.equals(r5)));
    }
}
