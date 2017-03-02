/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.dao;

import com.mycompany.dvdlibrary.dto.dvd;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface dvdInterface {

    void addDVD(dvd addDVD);

    void removeDVD(String title);

    List<dvd> listDVD();

    List<dvd> findDVD(String title);

    List<dvd> findDVDbyNYears (int n);

    List<dvd> findDVDbyRating (String rating);

    Map<String, List<dvd>> findDVDbyDirector (String director);

    List<dvd> findDVDbyStudio (String studio);

    double averageAge ();

    List<dvd> findDVDbyNew ();
}
