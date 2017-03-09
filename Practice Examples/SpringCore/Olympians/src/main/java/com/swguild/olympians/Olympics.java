/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.olympians;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mgaffney
 */
public class Olympics {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Olympian usaSkiJumper = (Olympian) ctx.getBean("usaSkiJumper");
        usaSkiJumper.competeInEvent();

        Olympian usaSpeedSkater = (Olympian) ctx.getBean("usaSpeedSkater");
        usaSpeedSkater.competeInEvent();

        Olympian canadaSpeedSkater = (Olympian) ctx.getBean("canadianSpeedSkater");
        canadaSpeedSkater.competeInEvent();
    }
}
