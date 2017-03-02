/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refactorintoobjects;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalculator {

    public static void runProgram() {
        Scanner kb = new Scanner(System.in);

        double currentBalance;
        double annualInterestRate;
        double totalYears;

        double yearNumber = 0;
        double yearlyInterest;
        double yearlyEndPrincipal;

        System.out.println("What amount in are you putting into the fund? ");
        currentBalance = kb.nextDouble();

        System.out.println("What is the annual interest rate of the fund? ");
        annualInterestRate = kb.nextDouble();

        System.out.println("How many years is the money going to stay in the fund? ");
        totalYears = kb.nextDouble();

        for (int i = 0; i < totalYears; i++) {
            yearNumber = yearNumber + 1;
            yearlyInterest = currentBalance * (Math.pow((1 + (annualInterestRate / 100) / 4), 4)) - currentBalance;
            yearlyEndPrincipal = (currentBalance + yearlyInterest);
            currentBalance = yearlyEndPrincipal;

            System.out.println("Year number:                                    " + yearNumber);
            System.out.println("Principal at the beginning of the year:        $" + currentBalance);
            System.out.println("Total amount of interest earned for the year:  $" + yearlyInterest);
            System.out.println("Principal at the end of the year:              $" + yearlyEndPrincipal + "\n");

        }
    }
}
