/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.sitelab;

import com.thesoftwareguild.sitelab.dto.LuckySevenDTO;
import java.util.Scanner;
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
public class LuckySevenController {

    @RequestMapping(value = "/jsp/luckySevenPlay", method = RequestMethod.POST)
    public String luckySevenPlay(HttpServletRequest req, Model model) {

        String startingValue = req.getParameter("startingBet");
        int value = Integer.parseInt(startingValue);

        model.addAttribute("LuckySevenDTO", runProgram(value));

        return "lsresponse";
    }

    public LuckySevenDTO runProgram(int value) {

        int currentValue = value;
        int totalRolls = 0;
        int maxValue = currentValue;
        int rollCount = totalRolls;

        while (currentValue > 0) {
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            int rollNumber = die1 + die2;
            totalRolls = totalRolls + 1;

            if (rollNumber == 7) {
                currentValue = currentValue + 4;
            } else {
                currentValue = currentValue - 1;
            }

            if (currentValue > maxValue) {
                maxValue = currentValue;
                rollCount = totalRolls;
            }
        }

        LuckySevenDTO dto = new LuckySevenDTO();
        dto.setStartingValue(value);
        dto.setTotalRolls(totalRolls);
        dto.setMaxValue(maxValue);
        dto.setRollCount(rollCount);

        return dto;
    }
}
