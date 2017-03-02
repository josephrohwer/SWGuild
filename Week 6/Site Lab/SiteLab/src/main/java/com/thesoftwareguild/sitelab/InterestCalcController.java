/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab;

import com.thesoftwareguild.sitelab.dto.InterestCalcDTO;
import java.text.DecimalFormat;
import java.util.ArrayList;
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
public class InterestCalcController {

    @RequestMapping(value = "/jsp/interestCalcStart", method = RequestMethod.POST)
    public String interestCalcStart(HttpServletRequest req, Model model) {

        String getAmount = req.getParameter("amount");
        double amount = Double.parseDouble(getAmount);

        String getRate = req.getParameter("rate");
        double rate = Double.parseDouble(getRate);

        String getYears = req.getParameter("years");
        double years = Double.parseDouble(getYears);

        model.addAttribute("InterestCalcDTO", runProgram(amount, rate, years));

        return "icresponse";
    }

    public InterestCalcDTO runProgram(double amount, double rate, double years) {

        InterestCalcDTO dto = new InterestCalcDTO();

        double currentBalance = amount;
        double annualInterestRate = rate;
        double totalYears = years;

        double yearNumber = 0;
        double yearlyInterest = 0;
        double yearlyEndPrincipal = 0;

        DecimalFormat df = new DecimalFormat("###.##");

        for (int i = 0; i < totalYears; i++) {
            yearNumber = yearNumber + 1;
            yearlyInterest = currentBalance * (Math.pow((1 + (annualInterestRate / 100) / 4), 4)) - currentBalance;
            yearlyEndPrincipal = (currentBalance + yearlyInterest);

            try {
                dto.getResults().add(new InterestCalcDTO(df.format(yearNumber), df.format(currentBalance), df.format(yearlyInterest), df.format(yearlyEndPrincipal)));
            } catch (Exception e) {
            }
            currentBalance = yearlyEndPrincipal;
        }

        return dto;
    }
}
