/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.dto;

/**
 *
 * @author apprentice
 */
public class dvd {
    
    private String title;
    private int releaseDate;
    private String MPAARating;
    private String directorName;
    private String studio;
    private String comment;
    
    public String toString() {
        String dvdTemp = ("Title: " + getTitle() + "\nRelease Date: " + getReleaseDate()
                        + "\nMPAA Rating: " + getMPAARating() + "\nDirector's Name: "
                        + getDirectorName() + "\nStudio's Name: " + getStudio() + "\nComment: "
                        + getComment() + "\n");
        return dvdTemp;
    }

    public dvd(String title, int releaseDate, String MPAARating, String directorName, String studio, String comment) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.MPAARating = MPAARating;
        this.directorName = directorName;
        this.studio = studio;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
