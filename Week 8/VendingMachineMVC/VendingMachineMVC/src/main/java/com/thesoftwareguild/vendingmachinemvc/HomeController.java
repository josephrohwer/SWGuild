/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.vendingmachinemvc;

import com.thesoftwareguild.vendingmachinemvc.dao.VendingMachine;
import com.thesoftwareguild.vendingmachinemvc.dto.Change;
import com.thesoftwareguild.vendingmachinemvc.dto.Vending;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author josephrohwer
 */
@Controller
public class HomeController {

    private VendingMachine dao;

    @Inject
    public HomeController(VendingMachine dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {

        List<Vending> iList = dao.listItems();
        model.addAttribute("vendingMachine", iList);
        return "home";
    }

    @RequestMapping(value = "/Input", method = RequestMethod.POST)
    public String Input(HttpServletRequest req, Model model) {

        List<Vending> iList = dao.listItems();
        model.addAttribute("vendingMachine", iList);

        String amount = req.getParameter("amount");
        double startingAmount = Double.parseDouble(amount);
        dao.setAmount(startingAmount);

        String choice = req.getParameter("choice");
        int selection = Integer.parseInt(choice);
        dao.setCost(selection);

        return Change(model);
    }

    @RequestMapping(value = "/Change", method = RequestMethod.GET)
    public String Change(Model model) {

        Change change = dao.makeChange();
        model.addAttribute("dto", change);
        return "displayChange";
    }
}
