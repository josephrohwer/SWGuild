/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.controller;

import com.thesoftwareguild.dvdlibrarymvc.dao.DVDLibrary;
import com.thesoftwareguild.dvdlibrarymvc.dao.SearchTerm;
import com.thesoftwareguild.dvdlibrarymvc.dto.DVD;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author josephrohwer
 */
@Controller
public class HomeControllerNoAjax {

    private DVDLibrary dao;

    @Inject
    public HomeControllerNoAjax(DVDLibrary dao) {
        this.dao = dao;
        dao.addDVD(new DVD("The Lord of the Rings: The Fellowship of the Ring", "2001", "PG-13", "Peter Jackson", "New Line Cinema", "Great Movie 10/10 - IGN"));
        dao.addDVD(new DVD("Interstellar", "2014", "PG-13", "Christopher Nolan", "Paramount Pictures", "5/7"));
    }

    @RequestMapping(value = "/displayDVDListNoAjax", method = RequestMethod.GET)
    public String displayDVDListNoAjax(Model model) {
        List<DVD> dList = dao.getAllDVDS();

        model.addAttribute("DVDList", dList);

        return "displayDVDListNoAjax";
    }

    @RequestMapping(value = "displayNewDVDFormNoAjax", method = RequestMethod.GET)
    public String displayNewDVDFormNoAjax() {
        return "newDVDFormNoAjax";
    }

    @RequestMapping(value = "/addNewDVDNoAjax", method = RequestMethod.POST)
    public String addNewDVDNoAjax(HttpServletRequest req) {
        String title = req.getParameter("title");
        String releaseDate = req.getParameter("releaseDate");
        String rating = req.getParameter("rating");
        String director = req.getParameter("director");
        String studio = req.getParameter("studio");
        String comment = req.getParameter("comment");

        DVD dvd = new DVD();
        dvd.setTitle(title);
        dvd.setReleaseDate(releaseDate);
        dvd.setRating(rating);
        dvd.setDirector(director);
        dvd.setStudio(studio);
        dvd.setComment(comment);

        dao.addDVD(dvd);

        return "redirect:displayDVDListNoAjax";
    }

    @RequestMapping(value = "/deleteDVDNoAjax", method = RequestMethod.GET)
    public String deleteDVDNoAjax(HttpServletRequest req) {

        int dvdId = Integer.parseInt(req.getParameter("dvdId"));

        dao.removeDVD(dvdId);

        return "redirect:displayDVDListNoAjax";
    }

    @RequestMapping(value = "/displayEditDVDFormNoAjax", method = RequestMethod.GET)
    public String displayEditDVDFormNoAjax(HttpServletRequest req, Model model) {

        int dvdId = Integer.parseInt(req.getParameter("dvdId"));

        DVD dvd = dao.getDVD(dvdId);

        model.addAttribute("dvd", dvd);

        return "editDVDFormNoAjax";
    }

    @RequestMapping(value = "/editDVDNoAjax", method = RequestMethod.POST)
    public String editDVDNoAjax(@Valid @ModelAttribute("dvd") DVD dvd,
            BindingResult result) {

        if (result.hasErrors()) {
            return "editDVDFormNoAjax";
        }

        dao.updateDVD(dvd);

        return "redirect:displayDVDListNoAjax";
    }

    @RequestMapping(value = "/displaySearchDVDFormNoAjax", method = RequestMethod.GET)
    public String displaySearchDVDFormNoAjax() {
        return "displaySearchDVDFormNoAjax";
    }

    @RequestMapping(value = "/searchDVDNoAjax", method = RequestMethod.POST)
    public String searchDVDNoAjax(HttpServletRequest req, Model model) {

        Map<SearchTerm, String> criteria = new HashMap<>();
        criteria.put(SearchTerm.TITLE, req.getParameter("title"));
        criteria.put(SearchTerm.RELEASE_DATE, req.getParameter("releaseDate"));
        criteria.put(SearchTerm.RATING, req.getParameter("rating"));
        criteria.put(SearchTerm.DIRECTOR, req.getParameter("director"));
        criteria.put(SearchTerm.STUDIO, req.getParameter("studio"));
        criteria.put(SearchTerm.COMMENT, req.getParameter("comment"));

        List<DVD> DVDList = dao.searchDVDS(criteria);

        model.addAttribute("searchList", DVDList);

        return "displaySearchResultsNoAjax";
    }
}
