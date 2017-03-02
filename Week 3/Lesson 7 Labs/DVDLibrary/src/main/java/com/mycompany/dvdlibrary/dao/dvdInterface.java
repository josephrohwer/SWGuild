/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.dao;

import com.mycompany.dvdlibrary.dto.dvd;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface dvdInterface {

    public void addDVD(dvd addDVD);

    public void removeDVD(String title);

    public List<dvd> listDVD();

    public List<dvd> findDVD(String title);
}
