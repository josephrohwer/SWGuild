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
public interface Drawable {
    
    void draw(double x, double y);
    void erase();
    void move(double x, double y);
}
