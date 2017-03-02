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
}
