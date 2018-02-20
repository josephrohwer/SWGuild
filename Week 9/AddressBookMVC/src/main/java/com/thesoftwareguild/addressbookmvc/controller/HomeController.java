/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.controller;

import com.thesoftwareguild.addressbookmvc.dao.AddressBook;
import com.thesoftwareguild.addressbookmvc.dto.Address;
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

    private AddressBook dao;

    @Inject
    public HomeController(AddressBook dao) {
        this.dao = dao;
    }

    @RequestMapping(value = {"/mainAjaxPage"}, method = RequestMethod.GET)
    public String displayMainAjaxPage() {
        // This method does nothing except return the logical name of the
        // view component (/jsp/home.jsp) that should be invoked in response
        // to this request.
        return "mainAjaxPage";
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Address getAddress(@PathVariable("id") int id) {
        return dao.getAddress(id);
    }

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Address createAddress(@Valid @RequestBody Address address) {
        dao.addAddress(address);
        return address;
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAddress(@PathVariable("id") int id) {
        dao.removeAddress(id);
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putAddress(@PathVariable("id") int id, @RequestBody Address address) {

        address.setAddressId(id);

        dao.updateAddress(address);
    }

    @RequestMapping(value = "/addresses", method = RequestMethod.GET)
    @ResponseBody
    public List<Address> getAllAddresses() {
        return dao.getAllAddresses();
    }
}
