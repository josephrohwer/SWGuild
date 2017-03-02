/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author apprentice
 */
public class MonthName {

    public static void main(String[] args) {
        System.out.println("Month 1: " + month_name(1));
        System.out.println("Month 2: " + month_name(2));
        System.out.println("Month 3: " + month_name(3));
        System.out.println("Month 4: " + month_name(4));
        System.out.println("Month 5: " + month_name(5));
        System.out.println("Month 6: " + month_name(6));
        System.out.println("Month 7: " + month_name(7));
        System.out.println("Month 8: " + month_name(8));
        System.out.println("Month 9: " + month_name(9));
        System.out.println("Month 10: " + month_name(10));
        System.out.println("Month 11: " + month_name(11));
        System.out.println("Month 12: " + month_name(12));
        System.out.println("Month 43: " + month_name(43));
    }

    public static String month_name(int x) {
        String monthString;
        switch (x) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        return monthString;
    }
}
