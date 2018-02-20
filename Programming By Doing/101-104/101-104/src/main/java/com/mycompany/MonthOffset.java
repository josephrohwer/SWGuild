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
public class MonthOffset {

    public static void main(String[] args) {
        System.out.println("Offset for month 1: " + month_offset(1));
        System.out.println("Offset for month 2: " + month_offset(2));
        System.out.println("Offset for month 3: " + month_offset(3));
        System.out.println("Offset for month 4: " + month_offset(4));
        System.out.println("Offset for month 5: " + month_offset(5));
        System.out.println("Offset for month 6: " + month_offset(6));
        System.out.println("Offset for month 7: " + month_offset(7));
        System.out.println("Offset for month 8: " + month_offset(8));
        System.out.println("Offset for month 9: " + month_offset(9));
        System.out.println("Offset for month 10: " + month_offset(10));
        System.out.println("Offset for month 11: " + month_offset(11));
        System.out.println("Offset for month 12: " + month_offset(12));
        System.out.println("Offset for month 43: " + month_offset(43));
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
}
