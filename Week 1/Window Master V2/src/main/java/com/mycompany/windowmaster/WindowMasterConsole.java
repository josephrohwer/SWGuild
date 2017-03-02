/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package com.mycompany.windowmaster;

import java.util.Scanner;

/*
 
  @author apprentice
 */
public class WindowMasterConsole {
    public static void main(String[] args) {
        
        float width;
        float height;
        float windowArea;
        float windowPerimeter;
        float glassCost;
        float trimCost;
        float totalCost;
        
        System.out.println("WindowMaster!");

        width = getInput("Please enter the window width: ");
       
        height = getInput("Please enter the window height: ");
        
        glassCost = getInput("What is the cost of the glass per square foot?: ");
        
        trimCost = getInput("What is the cost of the trim per linear foot?: ");
        
        windowArea = width * height;
        windowPerimeter = 2 * (width + height);
              
        System.out.println("The area is " + windowArea + " ft.");
        
        System.out.println("The perimeter is " + windowPerimeter + " squared ft.");
        
        totalCost = ((windowArea * glassCost) + (windowPerimeter * trimCost));
        
        System.out.printf("The total cost of the window is $%.2f", totalCost);
        
    }

     public static float getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        float userInput = scanner.nextFloat();
        if(minMax(userInput) == false) {
           userInput = getInput(prompt);
        }
        return userInput;
    }
    
     public static boolean minMax(float userInput) {
        if (userInput < 0.5) {
            System.out.println("Error: Value below minimum");
            return false;
        }
        else if (userInput > 50.0f) {
            System.out.println("Error: Value above maximum");
            return false;
        }
        else {
            return true;
        }
    }
}