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
public class InheritanceRunner {
    public static void main(String[] args) {
        
     
        Child c = new Child();
        Parent p = new Child();
        Object o = new Parent();
        System.out.println(c.talk());
        System.out.println(p.talk());
        if (o instanceof Child)
            System.out.println(((Child)o).talk());
    }
}
