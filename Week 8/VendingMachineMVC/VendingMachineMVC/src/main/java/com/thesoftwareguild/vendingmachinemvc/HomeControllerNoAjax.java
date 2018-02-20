/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.vendingmachinemvc;

import com.thesoftwareguild.vendingmachinemvc.dao.VendingMachine;
import com.thesoftwareguild.vendingmachinemvc.dto.Change;
import com.thesoftwareguild.vendingmachinemvc.dto.Vending;
import java.util.ArrayList;
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
public class HomeControllerNoAjax {

    private VendingMachine dao;

    @Inject
    public HomeControllerNoAjax(VendingMachine dao) {
        this.dao = dao;
        dao.addItem(new Vending("Rockstar", 2.29, 20));
        dao.addItem(new Vending("Chips Ahoy", 1.99, 10));
        dao.addItem(new Vending("Red Bull", 2.79, 15));
        dao.addItem(new Vending("Munchies Snack Mix", 1.49, 5));
    }

    @RequestMapping(value = "/displayVendingMachineNoAjax", method = RequestMethod.GET)
    public String home(Model model) {
        
        List<Vending> iList = dao.listItems();
        model.addAttribute("vendingMachine", iList);
        return "displayVendingMachineNoAjax";
    }

    @RequestMapping(value = "/getInput", method = RequestMethod.POST)
    public String getInput(HttpServletRequest req, Model model) {
        
        List<Vending> iList = dao.listItems();
        model.addAttribute("vendingMachine", iList);

        String amount = req.getParameter("amount");
        double startingAmount = Double.parseDouble(amount);
        dao.setAmount(startingAmount);

        String choice = req.getParameter("choice");
        int selection = Integer.parseInt(choice);
        dao.setCost(selection);

        return displayChange(model);
    }

    @RequestMapping(value = "/displayChange", method = RequestMethod.GET)
    public String displayChange(Model model) {
        
        Change change = dao.makeChange();
        model.addAttribute("dto", change);
        return "displayChange";
    }
}
