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
import org.springframework.jdbc.core.JdbcTemplate;

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
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = (DVDLibrary) ctx.getBean("DVDLibrary");
        JdbcTemplate cleaner = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        cleaner.execute("delete from dvds");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addGetDeleteDVD() {
        DVD nc = new DVD();
        nc.setTitle("The Martian");
        nc.setReleaseDate("2015");
        nc.setRating("PG-13");
        nc.setDirector("Steven");
        nc.setStudio("Fox");
        nc.setComment("9/10");
        dao.addDVD(nc);
        DVD fromDb = dao.getDVD(nc.getDvdId());
        assertEquals(fromDb.getDvdId(), nc.getDvdId());
        assertEquals(fromDb.getTitle(), nc.getTitle());
        assertEquals(fromDb.getReleaseDate(), nc.getReleaseDate());
        assertEquals(fromDb.getRating(), nc.getRating());
        assertEquals(fromDb.getDirector(), nc.getDirector());
        assertEquals(fromDb.getStudio(), nc.getStudio());
        assertEquals(fromDb.getComment(), nc.getComment());
        dao.removeDVD(nc.getDvdId());
        assertNull(dao.getDVD(nc.getDvdId()));
    }

    public void addUpdateDVD() {
        DVD nc = new DVD();
        nc.setTitle("Event Horizon");
        nc.setReleaseDate("2003");
        nc.setRating("R");
        nc.setDirector("Joseph");
        nc.setStudio("Paramount Pictures");
        nc.setComment("7/10");
        dao.addDVD(nc);
        nc.setRating("PG-13");
        dao.updateDVD(nc);
        DVD fromDb = dao.getDVD(nc.getDvdId());
        assertEquals(fromDb.getDvdId(), nc.getDvdId());
        assertEquals(fromDb.getTitle(), nc.getTitle());
        assertEquals(fromDb.getReleaseDate(), nc.getReleaseDate());
        assertEquals(fromDb.getRating(), nc.getRating());
        assertEquals(fromDb.getDirector(), nc.getDirector());
        assertEquals(fromDb.getStudio(), nc.getStudio());
        assertEquals(fromDb.getComment(), nc.getComment());
    }

    @Test
    public void getAllDVDs() {
        DVD nc = new DVD();
        nc.setTitle("Interstellar");
        nc.setReleaseDate("2014");
        nc.setRating("PG-13");
        nc.setDirector("John");
        nc.setStudio("Imax");
        nc.setComment("10/10");
        dao.addDVD(nc);

        DVD nc2 = new DVD();
        nc2.setTitle("Terminator 2");
        nc2.setReleaseDate("1987");
        nc2.setRating("R");
        nc2.setDirector("Alex");
        nc2.setStudio("Pixar");
        nc2.setComment("8/10");
        dao.addDVD(nc);
        List<DVD> cArr = dao.getAllDVDS();
        assertEquals(cArr.size(), 2);
    }
}
