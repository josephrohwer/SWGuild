/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.dto;

/**
 *
 * @author josephrohwer
 */
public class DVDCount {

    private String studio;
    private int numDVDS;

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getNumDVDS() {
        return numDVDS;
    }

    public void setNumDVDS(int numDVDS) {
        this.numDVDS = numDVDS;
    }
}
