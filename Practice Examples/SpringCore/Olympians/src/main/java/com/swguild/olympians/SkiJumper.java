/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.olympians;

/**
 *
 * @author mgaffney
 */
public class SkiJumper {

    private Event event;

    public SkiJumper() {
        event = new SkiJumpEvent();
    }

    public String competeInEvent() {
        return event.compete();
    }
}
