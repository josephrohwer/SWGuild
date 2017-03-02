/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SummingThreeNumbersFromAFile {
    public static void main(String[] args) throws Exception {
        
        Scanner filein = new Scanner(new File("3nums.txt"));
        int a = filein.nextInt();
        int b = filein.nextInt();
        int c = filein.nextInt();


        System.out.println(a + b + c);
        filein.close();
    }
}
