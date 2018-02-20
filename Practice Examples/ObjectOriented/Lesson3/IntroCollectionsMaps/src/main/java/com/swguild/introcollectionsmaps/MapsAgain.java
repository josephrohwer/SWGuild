/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.introcollectionsmaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author mgaffney
 */
public class MapsAgain {
    public static void main(String[] args) {
        HashMap<String, Integer> pops = new HashMap<>();
        pops.put("China", 1378910000);
        pops.put("India", 1200280000);
        //correct India
        pops.put("India",1330780000);
        pops.put("United States", 324547000);
        
        //get keys
        Set<String> countries = pops.keySet();
        
        //get values
        Collection<Integer> vals = pops.values();
        
        for(String c: countries) {
            System.out.println(c);
        }
        
        Iterator<Integer> iter = vals.iterator();
        
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        for (String c: countries) {
            System.out.println(c + ": " + pops.get(c));
        }
        
        HashMap<String, Gerbil> cage = new HashMap<>();
        
        cage.put("Aldo", new Gerbil("Aldo", "Brown and white", 2));
        cage.put("Hugo", new Gerbil("Hugo", "Black and white", 2));
        cage.put("Bear", new Gerbil("Bear", "Brown", 3));
        
        cage.get("Aldo").name = "Aldo Raines";
        
        for(String n: cage.keySet()) {
            System.out.println(cage.get(n).name);
        }
        
        for(Gerbil g: cage.values()) {
            System.out.println(g.name);
        }
        for(String n: cage.keySet()) {
            if (cage.get(n).age < 3) 
                System.out.println(n);
        }
        
        HashMap<String, ArrayList<Integer>> scores = new HashMap<>();
        
        scores.put("Mike", new ArrayList<Integer>());
        scores.put("Corbin", new ArrayList<Integer>());
        scores.put("Jonathan", new ArrayList<Integer>());
        
        scores.get("Mike").add(80);
        
        System.out.println(scores.get("Mike").get(0) * 3);
        
        
        
    }
    
    static class Gerbil {
        String color;
        int age;
        String name;
        
        public Gerbil(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }
    }
}
