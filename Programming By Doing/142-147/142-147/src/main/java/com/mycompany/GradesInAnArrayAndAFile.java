/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GradesInAnArrayAndAFile {

    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);
        String name;
        String file;

        System.out.print("Name (first last): ");
        name = kb.nextLine();
        System.out.print("Filename: ");
        file = kb.nextLine();
        System.out.println("");

        int copy[];
        copy = new int[5];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = (int) (Math.random() * 100) + 1;
        }

        PrintWriter writer = new PrintWriter(file);
        writer.println("Name: " + name);
        writer.println("Grade 1: " + copy[0]);
        writer.println("Grade 2: " + copy[1]);
        writer.println("Grade 3: " + copy[2]);
        writer.println("Grade 4: " + copy[3]);
        writer.println("Grade 5: " + copy[4]);
        writer.close();

        System.out.println("Here are your randomly-selected grades (hope you pass):");
        System.out.println("Grade 1: " + copy[0]);
        System.out.println("Grade 2: " + copy[1]);
        System.out.println("Grade 3: " + copy[2]);
        System.out.println("Grade 4: " + copy[3]);
        System.out.println("Grade 5: " + copy[4]);
        System.out.println("");
        System.out.println("Data saved in " + "\"" + file + "\".");

    }
}
