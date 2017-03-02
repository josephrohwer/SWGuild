/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SimpleCalculatorProgram {

    private static ConsoleIO console = new ConsoleIO();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int choice;
        float x;
        float y;

        System.out.println("SIMPLE CALCULATOR \n");
        do {

            System.out.println("What would you like to do?");
            System.out.println("1.) Addition  2.) Subtraction  3.) Multiplication  4.) Division  5.) Exit");
            choice = console.readInteger("");

            if (choice == 1) {
                System.out.println("Enter a number: ");
                x = console.readFloat("");
                System.out.println("Enter another number: ");
                y = console.readFloat("");
                SimpleCalculator.Addition(x, y);
                System.out.println("The result is " + SimpleCalculator.Addition(x, y));
            } else if (choice == 2) {
                System.out.println("Enter a number: ");
                x = console.readFloat("");
                System.out.println("Enter another number: ");
                y = console.readFloat("");
                SimpleCalculator.Subtraction(x, y);
                System.out.println("The result is " + SimpleCalculator.Subtraction(x, y));
            } else if (choice == 3) {
                System.out.println("Enter a number: ");
                x = console.readFloat("");
                System.out.println("Enter another number: ");
                y = console.readFloat("");
                SimpleCalculator.Multiplication(x, y);
                System.out.println("The result is " + SimpleCalculator.Multiplication(x, y));
            } else if (choice == 4) {
                System.out.println("Enter a number: ");
                x = console.readFloat("");
                System.out.println("Enter another number: ");
                y = console.readFloat("");
                SimpleCalculator.Division(x, y);
                System.out.println("The result is " + SimpleCalculator.Division(x, y));
            } else if (choice == 5) {
                System.out.println("Thank you!");
                System.exit(0);
            }

        } while (choice != 5);
    }
}
