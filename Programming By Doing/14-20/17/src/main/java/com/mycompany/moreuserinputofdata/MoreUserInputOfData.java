/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moreuserinputofdata;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String firstName;
        String lastName;
        int grade;
        int studentID;
        String loginID;
        float gpa;
        
        System.out.println("Please enter the following information so I can sell it for a profit!");
        
        System.out.println("First name: ");
        firstName = keyboard.next();
        
        System.out.println("Last name: ");
        lastName = keyboard.next();
        
        System.out.println("Grade (9-12)");
        grade = keyboard.nextInt();
        
        System.out.println("Student ID: ");
        studentID = keyboard.nextInt();
        
        System.out.println("Login: ");
        loginID = keyboard.next();
        
        System.out.println("GPA (0.0-4.0): ");
        gpa = keyboard.nextFloat();
        
        System.out.println("Your information:");
        
        System.out.println("    Login: " + loginID);
        System.out.println("    ID: " +    studentID);
        System.out.println("    Name: " +  lastName + "," + firstName);
        System.out.println("    GPA: " +   gpa);
        System.out.println("    Grade: " + grade);
    }
}
