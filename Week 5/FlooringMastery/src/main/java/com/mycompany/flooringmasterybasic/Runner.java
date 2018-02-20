/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic;

import com.mycompany.flooringmasterybasic.controller.Controller;
import com.mycompany.flooringmasterybasic.dao.OrderDAOProd;
import com.mycompany.flooringmasterybasic.dao.OrderDAOTest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author josephrohwer
 */
public class Runner {

    public static void main(String[] args) {
        switch (readConfigFile()) {
            case "Test":
                System.out.println("Test Mode");
                new Controller(new OrderDAOTest()).run();
                break;
            case "Prod":
                System.out.println("Production Mode");
                new Controller(new OrderDAOProd()).run();
                break;
        }
    }

    private static String readConfigFile() {
        Scanner scanFile;
        try {
            scanFile = new Scanner(new BufferedReader(new FileReader("Data/Config.txt")));
            return scanFile.nextLine().trim();
        } catch (FileNotFoundException e) {
            return "Test";
        }
    }
}
