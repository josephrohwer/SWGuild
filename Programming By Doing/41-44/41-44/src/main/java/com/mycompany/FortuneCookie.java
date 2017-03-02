/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class FortuneCookie {

    public static void main(String[] args) {
        Random r = new Random();

        int choice = 1 + r.nextInt(6);
        String response = "";

        switch (choice) {
            case 1:
                response = "You will be happy.";
                break;
            case 2:
                response = "You will be sad.";
                break;
            case 3:
                response = "You will be afraid.";
                break;
            case 4:
                response = "Yes you will be mad.";
                break;
            case 5:
                response = "You will die young.";
                break;
            case 6:
                response = "You will die old.";
                break;
            default:
                response = "8-BALL ERROR!";
                break;
        }

        System.out.println(
                "Fortune cookie says: " + response);
    }
}