/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.basicfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mgaffney
 */
public class BasicFIleIO {

    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

            out.println("Here's a line");
            out.print("Here's part of a line.");
            out.println(" Here's the end of the line.");
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("OudFile.txt")));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Program ended normally");
    }
}
