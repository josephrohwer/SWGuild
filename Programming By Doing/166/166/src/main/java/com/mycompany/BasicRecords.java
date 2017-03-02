/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
class student {

    String name;
    int grade;
    int average;
}

public class BasicRecords {

    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);

        student one = new student();
        System.out.print("Enter the first student's name: ");
        one.name = kb.next();
        System.out.print("Enter the first student's grade: ");
        one.grade = kb.nextInt();
        System.out.print("Enter the first student's average: ");
        one.average = kb.nextInt();
        System.out.println();

        student two = new student();
        System.out.print("Enter the second student's name: ");
        two.name = kb.next();
        System.out.print("Enter the second student's grade: ");
        two.grade = kb.nextInt();
        System.out.print("Enter the second student's average: ");
        two.average = kb.nextInt();
        System.out.println();

        student three = new student();
        System.out.print("Enter the third student's name: ");
        three.name = kb.next();
        System.out.print("Enter the third student's grade: ");
        three.grade = kb.nextInt();
        System.out.print("Enter the third student's average: ");
        three.average = kb.nextInt();
        System.out.println();

        System.out.println("The names are: " + one.name + ", " + two.name + ", " + three.name);
        System.out.println("The grades are: " + one.grade + ", " + one.grade + ", " + one.grade);
        System.out.println("The averages are: " + one.average + ", " + two.average + ", " + three.average + "\n");
        System.out.println("The average for the three students is: " + ((one.average + two.average + three.average) / 3));
    }
}