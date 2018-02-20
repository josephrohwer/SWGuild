/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic4;

/**
 *
 * @author apprentice
 */
public class Logic6 {

    public static void main(String[] args) {
        Logic6 kb = new Logic6();
        String alarm = kb.alarmClock(1, true);
        System.out.print(alarm);
    }

    public String alarmClock(int day, boolean vacation) {

        String alarm = "";

        if (vacation == false) {
            if (day > 0 && day < 6) {
                alarm = "7:00";
            } else if (day == 0 || day == 6) {
                alarm = "10:00";
            }
        } else if (vacation == true) {
            if (day > 0 && day < 6) {
                alarm = "10:00";
            } else if (day == 0 || day == 6) {
                alarm = "off";
            }
        }
        return alarm;
    }
}
