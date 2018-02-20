/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.dao;

import com.thesoftwareguild.dvdlibrarymvc.dto.DVD;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author josephrohwer
 */
public class DVDLibraryTest {

    private DVDLibrary dao;

    public DVDLibraryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("DVDLibrary", DVDLibrary.class);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddRemoveGetDVD() {
        DVD na = new DVD("Terminator", "1987", "R", "Steven", "Paramount", "Great Movie");
        dao.addDVD(na);
        DVD fromDb = dao.getDVD(na.getDvdId());
        assertEquals(fromDb, na);

        dao.removeDVD(na.getDvdId());
        assertNull(dao.getDVD(na.getDvdId()));
    }

    @Test
    public void testUpdateDVD() {
        DVD na = new DVD("Terminator", "1987", "R", "Steven", "Paramount", "Great Movie");
        dao.addDVD(na);

        na.setTitle("IT");
        dao.updateDVD(na);

        DVD fromDb = dao.getDVD(na.getDvdId());
        assertEquals(fromDb, na);
    }

    @Test
    public void testGetAllDVDS() {
        DVD na = new DVD("Terminator", "1987", "R", "Steven", "Paramount", "Great Movie");
        DVD na2 = new DVD("Interstellar", "2014", "PG-13", "Joseph", "Pixar", "AMAZING");
        dao.addDVD(na2);
        dao.addDVD(na);

        List<DVD> fromDb = dao.getAllDVDS();
        assertEquals(2, fromDb.size());
        assertTrue(fromDb.contains(na));
    }

    @Test
    public void testSearchDVDS() {
        DVD na = new DVD("Terminator", "1987", "R", "Steven", "Paramount", "Great Movie");
        DVD na2 = new DVD("Interstellar", "2014", "PG-13", "Joseph", "Pixar", "AMAZING");
        DVD na3 = new DVD("Martian", "2016", "R", "Alex", "Activision", "See it");

        dao.addDVD(na);
        dao.addDVD(na2);
        dao.addDVD(na3);

        Map<SearchTerm, String> criteria = new HashMap<>();
        criteria.put(SearchTerm.RELEASE_DATE, "1987");
        List<DVD> searchList = dao.searchDVDS(criteria);
        assertEquals(1, searchList.size());
        assertEquals(na, searchList.get(0));

        criteria.put(SearchTerm.RELEASE_DATE, "");

        criteria.put(SearchTerm.RATING, "R");
        searchList = dao.searchDVDS(criteria);
        assertEquals(2, searchList.size());
        assertTrue(searchList.contains(na));
        assertTrue(searchList.contains(na3));
    }
}
