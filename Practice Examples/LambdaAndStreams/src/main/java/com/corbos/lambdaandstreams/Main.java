/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corbos.lambdaandstreams;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author parallels
 */
public class Main {

    public static void main(String[] args) throws IOException {       
        
        
        PersonDataStore dataStore = new PersonDataStore();
        List<Person> people = dataStore.all();
//        people.stream()
//                .filter(i -> i.getCountry().startsWith("C"))
//                .forEach(i -> System.out.println(i.toString()));

//        people.stream()
//                .filter(i -> i.getCountry().startsWith("C"))
//                .map(i -> new GenericInterface(){
//                    String name = String.format("%s %s", i.getFirstName(), i.getLastName());
//                    int petCount = i.getPets().size();
//                })
//                .filter(i -> i.petCount > 0)
//                .forEach(i -> System.out.printf("%s: %s\n", i.name, i.petCount));
//        
//        people.stream()
//                .flatMap(i -> i.getPets().stream())
//                .sorted((a, b) -> a.getName().compareTo(b.getName()))
//                .limit(100)
//                .forEach(i -> System.out.printf("%s %s\n", i.getName(), i.getPetType()));
    }
}

interface GenericInterface{
}
