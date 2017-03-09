/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.mavenproject1;

/**
 *
 * @author mgaffney
 */
public class Line implements Drawable {
    
    double end1X, end1Y, end2X, end2Y;
    
    public Line(double x1, double y1, double x2, double y2) {
        end1X = x1;
        end2X = x2;
        end1Y = y1;
        end2Y = y2;
    }
    
    @Override
    public void draw(double x, double y) {
        System.out.println("Draws a line with it's center at the parameters' point");
    }

    @Override
    public void erase() {
        System.out.println("Removes line from plane");
    }

    @Override
    public void move(double x, double y) {
        System.out.println("Erases line from previous location and redraws at new location");
    }
    
    public double length() {
        return Math.sqrt(Math.pow(end1X - end2X, 2) + Math.pow(end1Y - end2Y, 2));
    }
    
}
