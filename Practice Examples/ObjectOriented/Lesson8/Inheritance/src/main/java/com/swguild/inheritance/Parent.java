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
public class Parent {
    private String name;
    
    public Parent(){
        this("John Smith");
    }
    
    public Parent(String name) {
        super();
        this.name = name;
    }
    
    public String talk() {
        return name + " says: Market conditions are very favorable for a leveraged acquisition this morning";
    }
    
    
}
