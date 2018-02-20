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
public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x; 
        this.y = y;
    }
    
    public Point(Point p) {
        x = p.x;
        y = p.y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
