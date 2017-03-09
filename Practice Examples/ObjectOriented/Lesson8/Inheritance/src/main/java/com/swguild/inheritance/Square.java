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
public class Square extends Rectangle {
    String color;
    
    public Square(double side, String color, Point center) {
        super(side, side, center, .5);
        this.color = color;
        
    }

    public Square(Square s) {
        super(s);
        //super(s.getLength(), s.getWidth());
        color = s.color;
    }
    
    public Square clone() {
        return new Square(this);
    }
    
//    public boolean equals(Object o) {
//        if (o == null) return false;
//        if (!(o instanceof Square)) return false;
//        Rectangle temp = (Rectangle)o;
//        return getLength() == temp.getLength() && getWidth() == temp.getWidth();
//    }
    public boolean equals(Object o) {
        return super.equals(o) && this.color.equals(((Square)o).color);
        //Sortcutting && prevents cast if the super.equals call returns false
    }
    
    public String toString() {
        return "Square of side " + getLength() +" at " + getCenter().toString();
    }
}
