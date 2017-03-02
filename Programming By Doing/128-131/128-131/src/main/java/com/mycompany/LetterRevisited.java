/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author apprentice
 */
public class LetterRevisited {

    public static void main(String[] args) throws Exception {
        
        PrintWriter pw = new PrintWriter(new FileWriter("LetterRevisited.txt"));
        pw.println("+---------------------------------------------------------+\n"
                + "|                                                    #### |\n"
                + "|                                                    #### |\n"
                + "|                                                    #### |\n"
                + "|                                                         |\n"
                + "|                                                         |\n"
                + "|                              Bill Gates                 |\n"
                + "|                              1 Microsoft Way            |\n"
                + "|                              Redmond, WA 98104          |\n"
                + "|                                                         |\n"
                + "+---------------------------------------------------------+\n");
        pw.close();
    }
}
