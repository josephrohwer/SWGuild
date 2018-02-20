/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unitoneskillcheck;

/**
 *
 * @author apprentice
 */
public class AreTheyTrue {  
    
    public String howTrue(boolean x, boolean y) {
        String answer = "";
        if (x == true && y == true) {
            answer = "BOTH";     
        }
        else if (x == true && y == false) {
            answer = "ONLY ONE";
        }
        else if (x == false && y == true) {
            answer = "ONLY ONE";
        }
        else if (x == false && y == false) {
            answer = "NEITHER";
        }
        
      return answer;
       
    }
    
    public static void main(String [] args) {
        AreTheyTrue areThey = new AreTheyTrue();
        
        System.out.println(areThey.howTrue(true, false));
    }
    
}
