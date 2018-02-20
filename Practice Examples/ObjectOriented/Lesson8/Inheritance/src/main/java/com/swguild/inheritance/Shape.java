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
public abstract class Shape {
    private double opacity;
    
    public Shape() {
        opacity = 1;
    }
    
    public Shape(double o) {
        opacity = o;
    }
    public Shape(Shape s) {
        opacity = s.opacity;
    }

    /**
     * @return the opacity
     */
    public double getOpacity() {
        return opacity;
    }

    /**
     * @param opacity the opacity to set
     */
    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }
    
    public abstract double area();
    
    
}
