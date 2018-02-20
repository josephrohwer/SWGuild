/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.dto;

import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author josephrohwer
 */
public class DVD {

    private int dvdId;
    @NotEmpty(message = "You must supply a value for Title.")
    @Length(max = 20, message = "Title must be no more than 20 characters in length.")
    private String title;
    @NotEmpty(message = "You must supply a value for Release Date.")
    @Length(max = 20, message = "Release Date must be no more than 20 characters in length.")
    private String releaseDate;
    @NotEmpty(message = "You must supply a value for Rating.")
    @Length(max = 5, message = "Rating must be no more than 5 characters in length.")
    private String rating;
    @NotEmpty(message = "You must supply a value for Director.")
    @Length(max = 20, message = "Director must be no more than 20 characters in length.")
    private String director;
    @NotEmpty(message = "You must supply a value for Studio.")
    @Length(max = 20, message = "Studio must be no more than 20 characters in length.")
    private String studio;
    @NotEmpty(message = "You must supply a value for Comment.")
    @Length(max = 200, message = "Comment must be no more than 200 characters in length.")
    private String comment;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.getDvdId();
        hash = 37 * hash + Objects.hashCode(this.getTitle());
        hash = 37 * hash + Objects.hashCode(this.getReleaseDate());
        hash = 37 * hash + Objects.hashCode(this.getRating());
        hash = 37 * hash + Objects.hashCode(this.getDirector());
        hash = 37 * hash + Objects.hashCode(this.getStudio());
        hash = 37 * hash + Objects.hashCode(this.getComment());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DVD other = (DVD) obj;
        if (this.getDvdId() != other.getDvdId()) {
            return false;
        }
        if (this.getReleaseDate() != other.getReleaseDate()) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.rating, other.rating)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        if (!Objects.equals(this.comment, other.comment)) {
            return false;
        }
        return true;
    }

    public DVD() {

    }

    public DVD(String title, String releaseDate, String rating, String director, String studio, String comment) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.director = director;
        this.studio = studio;
        this.comment = comment;
    }

    public int getDvdId() {
        return dvdId;
    }

    public void setDvdId(int dvdId) {
        this.dvdId = dvdId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
