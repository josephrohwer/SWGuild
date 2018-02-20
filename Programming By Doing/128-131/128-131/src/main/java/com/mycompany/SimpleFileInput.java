/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.*;
/**
 *
 * @author apprentice
 */
public class SimpleFileInput {
    
    public static void main(String [] args) throws Exception {
        
        String fileName = "name.txt";

        String line = null;

            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
        
    }
}