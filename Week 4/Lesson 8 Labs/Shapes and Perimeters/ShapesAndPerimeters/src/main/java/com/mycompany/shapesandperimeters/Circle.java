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
public class Circle extends Shape {
    private double a;
    
    @Override
    public double area() {
        return (3.14) * (a * a);
    }
    
    @Override
    public double perimeter() {
        return (a * 3.14 * 2);
    }

    public Circle(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
