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
public class DisplayingAFile {

    public static void main(String[] args) throws Exception {
        String choice;
        Scanner kb = new Scanner(System.in);
        System.out.print("Open which file: ");
        choice = kb.nextLine();

        Scanner fileIn = new Scanner(new File(choice));

        while (fileIn.hasNext()) {
            System.out.println(fileIn.nextLine());
        }

        fileIn.close();
    }
}
