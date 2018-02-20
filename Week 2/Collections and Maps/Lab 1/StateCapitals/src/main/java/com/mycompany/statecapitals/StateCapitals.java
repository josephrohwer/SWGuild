/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class StateCapitals {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        HashMap<String, String> info = new HashMap<>();
        info.put("Alabama", "Montgomery");
        info.put("Alaska", "Juneau");
        info.put("Arizona", "Phoenix");
        info.put("Arkansas", "Little Rock");
        info.put("California", "Sacramento");
        info.put("Colorado", "Denver");
        info.put("Connecticut", "Hartford");
        info.put("Delaware", "Dover");
        info.put("Florida", "Tallahassee");
        info.put("Georgia", "Atlanta");
        info.put("Hawaii", "Honolulu");
        info.put("Idaho", "Boise");
        info.put("Illinois", "Springfield");
        info.put("Indiana", "Indianapolis");
        info.put("Iowa", "Des Moines");
        info.put("Kansas", "Topeka");
        info.put("Kentucky", "Frankfort");
        info.put("Louisiana", "Baton Rouge");
        info.put("Maine", "Augusta");
        info.put("Maryland", "Annapolis");
        info.put("Massachusetts", "Boston");
        info.put("Michigan", "Lansing");
        info.put("Minnesota", "St. Paul");
        info.put("Mississippi", "Jackson");
        info.put("Missouri", "Jefferson City");
        info.put("Montana", "Helena");
        info.put("Nebraska", "Lincoln");
        info.put("Nevada", "Carson City");
        info.put("New Hampshire", "Concord");
        info.put("New Jersey", "Trenton");
        info.put("New Mexico", "Santa Fe");
        info.put("New York", "Albany");
        info.put("North Carolina", "Raleigh");
        info.put("North Dakota", "Bismarck");
        info.put("Ohio", "Columbus");
        info.put("Oklahoma", "Oklahoma City");
        info.put("Oregon", "Salem");
        info.put("Pennsylvania", "Harrisburg");
        info.put("Rhode Island", "Providence");
        info.put("South Carolina", "Columbia");
        info.put("South Dakota", "Pierre");
        info.put("Tennessee", "Nashville");
        info.put("Texas", "Austin");
        info.put("Utah", "Salt Lake City");
        info.put("Vermont", "Montpelier");
        info.put("Virginia", "Richmond");
        info.put("Washington", "Olympia");
        info.put("West Virginia", "Charleston");
        info.put("Wisconsin", "Madison");
        info.put("Wyoming", "Cheyenne");

        //get keys
        Collection<String> states = info.keySet();

        //get values
        Collection<String> capitals = info.values();

        //displays states
        for (String s : states) {
            System.out.println(s);
        }

        System.out.println("");

        //displays capitals
        for (String c : capitals) {
            System.out.println(c);
        }

        System.out.println("");

        //displays states and capitals
        for (String s : states) {
            System.out.println(s + " - " + info.get(s));
        }

        System.out.println("");
        String pickState;
        
        do {
        System.out.println("Enter a state to find out its capital: ");
        pickState = kb.next();
        System.out.println(info.get(pickState));
        } while (info.get(pickState) == null);
    }
}
