/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab;

import com.thesoftwareguild.sitelab.dto.FactorizorDTO;
import java.util.ArrayList;
import java.util.List;
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
public class FactorizorController {

    @RequestMapping(value = "/jsp/factorizorStart", method = RequestMethod.POST)
    public String factorizorStart(HttpServletRequest req, Model model) {

        String startingValue = req.getParameter("numFactor");
        int value = Integer.parseInt(startingValue);

        model.addAttribute("FactorizorDTO", runProgram(value));

        return "factresponse";
    }

    public FactorizorDTO runProgram(int value) {

        FactorizorDTO dto = new FactorizorDTO();
        
        int temp = 0;
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                dto.getFactors().add(i);
                temp += i;
            }
        }

        boolean prime = true;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                prime = false;
            }
        }

        String isPerfect = " is not a perfect number.";
        String isPrime = " is not a prime number.";

        if (temp == value) {
            isPerfect = " is a perfect number.";
        }

        if (prime) {
            isPrime = " is a prime number.";
        }

        dto.setValue(value);
        dto.setIsPerfect(isPerfect);
        dto.setIsPrime(isPrime);
        
        return dto;
    }
}
