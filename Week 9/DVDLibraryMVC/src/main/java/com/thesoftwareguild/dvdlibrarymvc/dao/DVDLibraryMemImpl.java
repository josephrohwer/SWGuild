/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.dao;

import com.thesoftwareguild.dvdlibrarymvc.dto.DVD;
import com.thesoftwareguild.dvdlibrarymvc.dto.DVDCount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author josephrohwer
 */
public class DVDLibraryMemImpl implements DVDLibrary {

    private Map<Integer, DVD> DVDMap = new HashMap<>();
    private static int dvdIdCounter = 0;

    @Override
    public DVD addDVD(DVD dvd) {
        dvd.setDvdId(dvdIdCounter);
        dvdIdCounter++;
        DVDMap.put(dvd.getDvdId(), dvd);
        return dvd;
    }

    @Override
    public void removeDVD(int dvdId) {
        DVDMap.remove(dvdId);
    }

    @Override
    public void updateDVD(DVD dvd) {
        DVDMap.put(dvd.getDvdId(), dvd);
    }

    @Override
    public List<DVD> getAllDVDS() {
        Collection<DVD> a = DVDMap.values();
        return new ArrayList(a);
    }

    @Override
    public DVD getDVD(int dvdId) {
        return DVDMap.get(dvdId);
    }

    @Override
    public List<DVD> searchDVDS(Map<SearchTerm, String> criteria) {
        
        String titleCriteria = criteria.get(SearchTerm.TITLE);
        String releaseDateCriteria = criteria.get(SearchTerm.RELEASE_DATE);
        String ratingCriteria = criteria.get(SearchTerm.RATING);
        String directorCriteria = criteria.get(SearchTerm.DIRECTOR);
        String studioCriteria = criteria.get(SearchTerm.STUDIO);
        String commentCriteria = criteria.get(SearchTerm.COMMENT);

        Predicate<DVD> titleMatches;
        Predicate<DVD> releaseDateMatches;
        Predicate<DVD> ratingMatches;
        Predicate<DVD> directorMatches;
        Predicate<DVD> studioMatches;
        Predicate<DVD> commentMatches;

        Predicate<DVD> truePredicate = (c) -> {
            return true;
        };

        titleMatches = (titleCriteria == null || titleCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getTitle().equalsIgnoreCase(titleCriteria);

        releaseDateMatches = (releaseDateCriteria == null || releaseDateCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getReleaseDate().equalsIgnoreCase(releaseDateCriteria);

        ratingMatches = (ratingCriteria == null || ratingCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getRating().equalsIgnoreCase(ratingCriteria);

        directorMatches = (directorCriteria == null || directorCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getDirector().equalsIgnoreCase(directorCriteria);

        studioMatches = (studioCriteria == null || studioCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getStudio().equalsIgnoreCase(studioCriteria);

        commentMatches = (commentCriteria == null || commentCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getComment().equals(commentCriteria);

        return DVDMap.values().stream()
                .filter(titleMatches
                        .and(releaseDateMatches)
                        .and(ratingMatches)
                        .and(directorMatches)
                        .and(studioMatches)
                        .and(commentMatches))
                .collect(Collectors.toList());
    }

    @Override
    public List<DVDCount> getStudioDVDCounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
