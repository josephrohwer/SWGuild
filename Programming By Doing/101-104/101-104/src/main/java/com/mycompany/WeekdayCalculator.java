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
public class WeekdayCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
        System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
        System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
        System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
        System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
        System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

        System.out.println("You were born on " + weekday(mm, dd, yyyy));
    }

    public static String weekday(int mm, int dd, int yyyy) {
        int yy, total;
        String date = "";
        
        yy = yyyy - 1900;
        total = ((yy / 4) + yy);
        
        total = total + dd;
        total = total + month_offset(mm);
        
        if (mm < 3 && is_leap(yyyy) == true) {
            total = total - 1;
        }
        
        total = total % 7;
        
        date = weekday_name(total) + ", " + month_name(mm) + " " + dd + ", " + yyyy;

        return date;

    }

    public static String weekday_name(int weekday) {
        String result;

        switch (weekday) {
            case 1:
                result = "Sunday";
                break;
            case 2:
                result = "Monday";
                break;
            case 3:
                result = "Tuesday";
                break;
            case 4:
                result = "Wednesday";
                break;
            case 5:
                result = "Thursday";
                break;
            case 6:
                result = "Friday";
                break;
            case 7:
                result = "Saturday";
                break;
            case 0:
                result = "Saturday";
                break;
            default:
                result = "error";
                break;
        }

        return result;
    }

    public static int month_offset(int month) {
        int monthInt;
        switch (month) {
            case 1:
                monthInt = 1;
                break;
            case 2:
                monthInt = 4;
                break;
            case 3:
                monthInt = 4;
                break;
            case 4:
                monthInt = 0;
                break;
            case 5:
                monthInt = 2;
                break;
            case 6:
                monthInt = 5;
                break;
            case 7:
                monthInt = 0;
                break;
            case 8:
                monthInt = 3;
                break;
            case 9:
                monthInt = 6;
                break;
            case 10:
                monthInt = 1;
                break;
            case 11:
                monthInt = 4;
                break;
            case 12:
                monthInt = 6;
                break;
            default:
                monthInt = -1;
                break;
        }
        return monthInt;
    }

    public static String month_name(int x) {
        String monthString;
        switch (x) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        return monthString;
    }

    public static boolean is_leap(int year) {
        // years which are evenly divisible by 4 are leap years,
        // but years divisible by 100 are not leap years,
        // though years divisible by 400 are leap years
        boolean result;

        if (year % 400 == 0) {
            result = true;
        } else if (year % 100 == 0) {
            result = false;
        } else if (year % 4 == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
