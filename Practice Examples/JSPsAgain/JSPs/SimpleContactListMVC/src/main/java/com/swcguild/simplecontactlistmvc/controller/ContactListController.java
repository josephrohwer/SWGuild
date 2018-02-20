
package com.swcguild.simplecontactlistmvc.controller;

import com.swcguild.simplecontactlistmvc.dto.Contact;
import java.util.ArrayList;
import java.util.List;
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
public class ContactListController {
    
    @RequestMapping(value="displayContactList", method=RequestMethod.GET)
    public String displayContactList(HttpServletRequest req, Model model) {
        
        Contact c1 = new Contact();
        c1.setFirstName("Joe");
        c1.setLastName("Smith");
        c1.setEmail("jsmith@smith.com");
        
        Contact c2 = new Contact();
        c2.setFirstName("John");
        c2.setLastName("Doe");
        c2.setEmail("jdoe@doe.com");
        
        Contact c3 = new Contact();
        c3.setFirstName("Sally");
        c3.setLastName("Doe");
        c3.setEmail("sdoe@doe.com");
        
        List<Contact> cList = new ArrayList<>();
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        
        model.addAttribute("listOfContacts", cList);
        
        return "displayContactList";
    }

}
