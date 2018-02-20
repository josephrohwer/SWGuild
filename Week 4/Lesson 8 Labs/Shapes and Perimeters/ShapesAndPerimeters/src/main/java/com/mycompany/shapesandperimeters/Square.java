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
public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }
    
    @Override
    public double area() {
        return length * length;
    }
    
    @Override
    public double perimeter() {
        return (length * 4);
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
