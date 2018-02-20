/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SummingThreeNumbersFromAnyFile {
    public static void main(String[] args) throws Exception {
        String choice;
        Scanner kb = new Scanner(System.in);
        System.out.print("Which file would you like to read numbers from: ");
        choice = kb.nextLine();
        
        Scanner filein = new Scanner(new File(choice));
        int a = filein.nextInt();
        int b = filein.nextInt();
        int c = filein.nextInt();


        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
        filein.close();
    }
}
