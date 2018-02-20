
package com.swcguild.simplecontactlistmvc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author warde
 */
@Controller
public class RsvpController {
    
    @RequestMapping(value="displayRsvpForm", method=RequestMethod.GET)
    public String displayRsvpForm(HttpServletRequest req, Model model) {
        return "displayRsvpForm";
    }
    
    @RequestMapping(value="submitRsvpForm", method=RequestMethod.POST)
    public String submitRsvpForm(HttpServletRequest req, Model model) {
        
        String guestAnswer = req.getParameter("answer");
        
        String responseMessage = "";
        if (guestAnswer.equalsIgnoreCase("No")) {
            responseMessage = "Sorry - wish you could be here...";
        } else {
            responseMessage = "Can't wait to see you!!!";
        }
        
        model.addAttribute("responseMessage", responseMessage);
        
        return "rsvpResult";
    }
}