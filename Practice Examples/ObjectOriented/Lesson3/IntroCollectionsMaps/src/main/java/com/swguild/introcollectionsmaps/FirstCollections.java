package com.swguild.introcollectionsmaps;


import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mgaffney
 */
public class FirstCollections {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Hello");
        al.add("World");
        al.set(1, al.get(1).toUpperCase());
        
        al.add(1, "Beautiful");
        
        for(String s: al) {
            System.out.println(s);
        }
        
        Iterator<String> iter = al.iterator();
        
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}
