/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.controller;

import com.thesoftwareguild.dvdlibrarymvc.dao.DVDLibrary;
import com.thesoftwareguild.dvdlibrarymvc.dto.DVD;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author josephrohwer
 */
@Controller
public class HomeController {

    private DVDLibrary dao;

    @Inject
    public HomeController(DVDLibrary dao) {
        this.dao = dao;
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }

    @RequestMapping(value = {"/mainAjaxPage"}, method = RequestMethod.GET)
    public String displayMainAjaxPage() {
        return "mainAjaxPage";
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.GET)
    @ResponseBody
    public DVD getDVD(@PathVariable("id") int id) {
        return dao.getDVD(id);
    }

    @RequestMapping(value = "/dvd", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public DVD createDVD(@Valid @RequestBody DVD dvd) {
        dao.addDVD(dvd);
        return dvd;
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDVD(@PathVariable("id") int id) {
        dao.removeDVD(id);
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putDVD(@PathVariable("id") int id, @RequestBody DVD dvd) {
        dvd.setDvdId(id);
        dao.updateDVD(dvd);
    }

    @RequestMapping(value = "/dvds", method = RequestMethod.GET)
    @ResponseBody
    public List<DVD> getAllDVDS() {
        return dao.getAllDVDS();
    }
}
