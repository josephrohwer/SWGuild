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
public class Rectangle extends Shape {
   private double length, width;
   private Point center;
   
   public Rectangle(double l, double w, Point c) {
       length = l;
       width = w;
       center = new Point(c);
   }
   
   public Rectangle(double l, double w, Point c, double o) {
       super(o);
       length = l;
       width = w;
       center = new Point(c);
   }
   
   public Rectangle(Rectangle r) {
       super(r);
       length = r.length;
       width = r.width;
       center = new Point(r.center);
   }
   
   public double area() {
       return getLength()*getWidth();
   }
   
   public double perimeter() {
       return 2 * (getLength() + getWidth());
   }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the center
     */
    public Point getCenter() {
        return new Point(center);
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = new Point(center);
    }
    
    public Rectangle clone() {
        return new Rectangle(this);
    }
   
    public String toString() {
        return length + " x " + width + " rectangle at " + center.toString();
    }
//    If instanceof is used, this MUST be final to prevent inconsistent implementations
//    in subclasses.
//    public final boolean equals(Object o) {
//        if (o == null) return false;
//        if (!(o instanceof Rectangle)) return false;
//        Rectangle temp = (Rectangle)o;
//        return length == temp.length && width == temp.width;
//    }
    
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(this.getClass() == o.getClass())) return false;
        Rectangle temp = (Rectangle)o;
        return getLength() == temp.getLength() && getWidth() == temp.getWidth();
    }
   
}
