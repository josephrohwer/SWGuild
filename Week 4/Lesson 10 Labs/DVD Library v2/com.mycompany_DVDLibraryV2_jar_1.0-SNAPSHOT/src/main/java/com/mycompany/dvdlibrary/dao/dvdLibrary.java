/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.dao;

import com.mycompany.dvdlibrary.dto.dvd;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class dvdLibrary implements dvdInterface {

    ArrayList<dvd> dvds = new ArrayList<>();
    private dvdDataAccess dao = new dvdDataAccess();

    public dvdLibrary() {
        try {
            dvds.addAll(dao.readDVD());
        } catch (Exception ex) {
            Logger.getLogger(dvdLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void addDVD(dvd addDVD) {
        dvds.add(addDVD);
        try {
            dao.writeDVD(dvds);
        } catch (Exception ex) {
            Logger.getLogger(dvdLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void removeDVD(String title) {
        for (int i = 0; i < dvds.size(); i++) {
            if (dvds.get(i).getTitle().equals(title)) {
                dvds.remove(i);
                break;
            }
        }
        try {
            dao.writeDVD(dvds);
        } catch (Exception ex) {
            Logger.getLogger(dvdLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<dvd> listDVD() {
        List<dvd> dvdTemp = new ArrayList<>();

        for (dvd d : dvds) {
            dvdTemp.add(d);
        }
        return dvdTemp;
    }

    @Override
    public List<dvd> findDVD(String title) {
        List<dvd> dvdTemp = new ArrayList<>();
        for (dvd d : dvds) {
            if (d.getTitle().equals(title)) {
                dvdTemp.add(d);
                return dvdTemp;
            }
        }
        return null;
    }

    @Override
    public List<dvd> findDVDbyNYears(int n) {

        List<dvd> dvdTemp = new ArrayList<>();
        for (dvd d : dvds) {
            if (d.getReleaseDate() >= (2015 - n)) {
                dvdTemp.add(d);
            }
        }
        if (dvdTemp.size() > 0) {
            return dvdTemp;
        } else {
            return null;
        }
    }

    @Override
    public List<dvd> findDVDbyRating(String rating) {
        List<dvd> dvdTemp = new ArrayList<>();
        for (dvd d : dvds) {
            if (d.getMPAARating().equals(rating)) {
                dvdTemp.add(d);
            }
        }
        if (dvdTemp.size() > 0) {
            return dvdTemp;
        } else {
            return null;
        }
    }

    @Override
    public Map<String, List<dvd>> findDVDbyDirector(String director) {
        Map<String, List<dvd>> dvdTemp
                = dvds.stream()
                .filter(a -> a.getDirectorName().equals(director))
                .collect(Collectors.groupingBy(dvd::getMPAARating));

        return dvdTemp;
    }

    @Override
    public List<dvd> findDVDbyStudio(String studio) {
        List<dvd> dvdTemp = new ArrayList<>();
        for (dvd d : dvds) {
            if (d.getStudio().equals(studio)) {
                dvdTemp.add(d);
            }
        }
        if (dvdTemp.size() > 0) {
            return dvdTemp;
        } else {
            return null;
        }
    }

    @Override
    public double averageAge() {
        double total = 0;
        for (dvd d : dvds) {
            int n = d.getReleaseDate();
            total += (n - 1900);
        }
        total = (total / dvds.size());
        return total;
    }

    @Override
    public List<dvd> findDVDbyNew() {
        int largest = 0;
        int n = 0;
        int temp = 0;
        List<dvd> dvdTemp = new ArrayList<>();

        for (dvd d : dvds) {
            n = (d.getReleaseDate());
            if (n > largest) {
                largest = n;
                temp = n;
            }
        }

        for (dvd d : dvds) {
            if (d.getReleaseDate() == temp) {
                dvdTemp.add(d);
            }
        }
        if (dvdTemp.size() > 0) {
            return dvdTemp;
        } else {
            return null;
        }
    }
}
