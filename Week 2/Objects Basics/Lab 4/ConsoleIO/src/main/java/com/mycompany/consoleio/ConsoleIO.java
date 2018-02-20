/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consoleio;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    Scanner kb = new Scanner(System.in);

    public int readInteger(String p) {
        System.out.print(p);
        return kb.nextInt();
    }

    public int readInteger(String p, int min, int max) {
        int ret;
        do {
            System.out.print(p);
            ret = kb.nextInt();
        } while (ret < min || ret > max);
        return ret;
    }

    public String readString(String p) {
        System.out.print(p);
        return kb.nextLine();
    }

    public float readFloat(String p) {
        System.out.print(p);
        return kb.nextFloat();
    }

    public float readFloat(String p, float min, float max) {
        float ret;
        do {
            System.out.print(p);
            ret = kb.nextFloat();
        } while (ret < min || ret > max);
        return ret;
    }

    public double readDouble(String p) {
        System.out.print(p);
        return kb.nextDouble();
    }

    public double readDouble(String p, double min, double max) {
        double ret;
        do {
            System.out.print(p);
            ret = kb.nextDouble();
        } while (ret < min || ret > max);
        return ret;
    }

    public void write(String p) {
        System.out.print(p);
    }
}
