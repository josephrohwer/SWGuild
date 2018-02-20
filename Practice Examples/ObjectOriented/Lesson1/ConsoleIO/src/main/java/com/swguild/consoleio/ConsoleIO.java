/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.consoleio;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mgaffney
 */
public class ConsoleIO {
    Scanner kb = new Scanner(System.in);
    public int readInteger(String p) {
        boolean failed;
        int ret = 0;
        do {
            failed = false;
            System.out.print(p);
            try {
                ret = kb.nextInt();
                kb.nextLine();
            } 
            catch (InputMismatchException e) {
               System.out.println("Input must be an integer."); 
               failed = true;
               kb.nextLine();
            }
        }while (failed);
        return ret;
    }
    
    public int readInteger(String p, int min, int max) {
        boolean failed;
        int ret = 0;
        do {
            failed = false;
            System.out.print(p);
            try {
                ret = kb.nextInt();
                kb.nextLine();
                if(ret < min || ret > max) {
                    System.out.println("Value must be between " + min 
                            + " and " + max + ".");
                    failed = true;
                }
            } 
            catch (InputMismatchException e) {
               System.out.println("Input must be an integer."); 
               failed = true;
               kb.nextLine();
            }
        }while (failed);
        
        return ret;
    }
    
    public String readString(String p) {
        System.out.print(p);
        return kb.nextLine();
    }
    
    public float readFloat(String p) {
        boolean failed;
        float ret = 0;
        do {
            failed = false;
            System.out.print(p);
            try {
                ret = kb.nextFloat();
                kb.nextLine();
            } 
            catch (InputMismatchException e) {
               System.out.println("Input must be a number."); 
               failed = true;
               kb.nextLine();
            }
        }while (failed);
        return ret;
    }  
    
    public float readFloat(String p, float min, float max) {
        boolean failed;
        float ret = 0;
        do {
            failed = false;
            System.out.print(p);
            try {
                ret = kb.nextFloat();
                kb.nextLine();
                if(ret < min || ret > max) {
                    System.out.println("Value must be between " + min 
                            + " and " + max + ".");
                    failed = true;
                }
            } 
            catch (InputMismatchException e) {
               System.out.println("Input must be a number."); 
               failed = true;
               kb.nextLine();
            }
        }while (failed);
        
        return ret;
    }
    
    public double readDouble(String p) {
        boolean failed;
        double ret = 0;
        do {
            failed = false;
            System.out.print(p);
            try {
                ret = kb.nextDouble();
                kb.nextLine();
            } 
            catch (InputMismatchException e) {
               System.out.println("Input must be a number."); 
               failed = true;
               kb.nextLine();
            }
        }while (failed);
        return ret;
    }
    
    public double readDouble(String p, double min, double max) {
        boolean failed;
        double ret = 0;
        do {
            failed = false;
            System.out.print(p);
            try {
                ret = kb.nextDouble();
                kb.nextLine();
                if(ret < min || ret > max) {
                    System.out.println("Value must be between " + min 
                            + " and " + max + ".");
                    failed = true;
                }
            } 
            catch (InputMismatchException e) {
               System.out.println("Input must be a number."); 
               failed = true;
               kb.nextLine();
            }
        }while (failed);
        
        return ret;
    }
    
    public LocalDate readDate(String p) {
        System.out.print(p);
        String dateString;
        LocalDate date = null;
        boolean badDate = true;
        while(badDate) {
            badDate = false;
            try {
                dateString = kb.nextLine();
                date = LocalDate.parse(dateString);
            }
            catch(DateTimeParseException e) {
                System.out.print("Date must be in format yyyy-mm-dd.\n" +
                        "Please re-enter: ");
                badDate = true;
            }
        }
        return date;
    }
    
    public LocalDate readDate(String p, LocalDate min, LocalDate max) {
        LocalDate in = readDate(p);
        do { 
            if (in.compareTo(min) < 0 || in.compareTo(max) > 0) {
                System.out.print("Date must be between " + min.toString() + " and " + max.toString() + ".\n" 
                + "Please re-enter: ");
                in = readDate("");
            }
        } while(in.compareTo(min) < 0 || in.compareTo(max) > 0);
        return in;
    }
    
    public void write(String p) {
        System.out.print(p);
    }
}
