/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.dao;

import com.thesoftwareguild.dvdlibrarymvc.dto.DVD;
import com.thesoftwareguild.dvdlibrarymvc.dto.DVDCount;
import java.util.List;
import java.util.Map;

/**
 *
 * @author josephrohwer
 */
public interface DVDLibrary {

    public DVD addDVD(DVD dvd);

    public void removeDVD(int dvdId);

    public void updateDVD(DVD dvd);

    public List<DVD> getAllDVDS();

    public DVD getDVD(int dvdId);

    public List<DVD> searchDVDS(Map<SearchTerm, String> criteria);
    
    public List<DVDCount> getStudioDVDCounts();
}
