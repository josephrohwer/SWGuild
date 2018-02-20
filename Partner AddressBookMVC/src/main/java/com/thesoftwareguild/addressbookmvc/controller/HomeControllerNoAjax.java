/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.controller;

import com.thesoftwareguild.addressbookmvc.dao.AddressBook;
import com.thesoftwareguild.addressbookmvc.dao.SearchTerm;
import com.thesoftwareguild.addressbookmvc.dto.Address;
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
 * @author apprentice
 */
@Controller
public class HomeControllerNoAjax {

    // Reference to our DAO
    private AddressBook dao;

    // Use annotation-driven constructor injection to inject a DAO implementation
    // into our controller
    @Inject
    public HomeControllerNoAjax(AddressBook dao) {
        this.dao = dao;
    }

    // This endpoint simply returns the name of the view that will serve as
    // the main landing page for the new functionality. The name of that view
    // is displayContactListNoAjax.jsp.
    //
    // NOTE: The RequestMapping value, the name of the method, and the name
    // of the JSP are all the same in this case (displayContactListNoAjax).
    // THIS IS NOT A REQUIREMENT!!! These names can be all different if
    // you want them to be.
    //
    // NOTE: This method does takes a Model object as a parameter. This is
    // because this method gets a list of all the Contact objects from the
    // DAO. We need to place this list on the Model so that Spring MVC
    // can pass the list of Contacts on to the view component. We'll
    // use JSTL tags to iterate through the list and print the Contact
    // information to the screen.
    @RequestMapping(value = "/displayAddressBookNoAjax", method = RequestMethod.GET)
    public String displayAddressBookNoAjax(Model model) {
        List<Address> aList = dao.getAllAddresses();
        model.addAttribute("addressBook", aList);
        return "displayAddressBookNoAjax";
    }

    @RequestMapping(value = "/displayNewAddressFormNoAjax", method = RequestMethod.GET)
    public String displayNewAddressFormNoAjax() {
        return "newAddressFormNoAjax";
    }

    @RequestMapping(value = "/addNewAddressNoAjax", method = RequestMethod.POST)
    public String addNewAddressNoAjax(HttpServletRequest req) {
        // Get all of the form data from the request
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zipCode = req.getParameter("zipCode");

        // Create a new Contact and set all the fields
        Address a = new Address(firstName, lastName, address, city, state, zipCode);

        // Add the Contact to the DAO
        dao.addAddress(a);

        // Redirect to the displayContactListNoAjax controller endpoint - we must
        // use the redirect: here so that Spring MVC routes us to the controller
        // endpoint and not directly to a JSP.
        return "redirect:displayAddressBookNoAjax";
    }

    @RequestMapping(value = "/deleteAddressNoAjax", method = RequestMethod.GET)
    public String deleteAddressNoAjax(HttpServletRequest req) {
        // Get the id of the contact to be deleted from the HttpServletRequest
        int addressId = Integer.parseInt(req.getParameter("addressId"));

        // Ask DAO to delete the given contact
        dao.removeAddress(addressId);

        // Redirect to the displayContactListNoAjax controller endpoint - we must
        // use the redirect: here so that Spring MVC routes us to the controller
        // endpoint.
        return "redirect:displayAddressBookNoAjax";
    }
    // This method gets the id of the Contact to be edited from the HttpServletRequest,
    // retrieves the specified Contact from the DAO, puts the retrieved Contact
    // on the Model, and returns the name of the view that will display the
    // Contact data in the Edit Form.

    @RequestMapping(value = "/displayEditAddressFormNoAjax", method = RequestMethod.GET)
    public String displayEditAddressFormNoAjax(HttpServletRequest req, Model model) {
        // Get the id of the Contact to be edited
        int addressId = Integer.parseInt(req.getParameter("addressId"));
        // Get the Contact from the DAO
        Address address = dao.getAddress(addressId);
        // Put the Contact on the Model
        model.addAttribute("address", address);

        return "displayEditAddressFormNoAjax";
    }

    // This method uses the @ModelAttribute annotation to tell Spring to
    // convert the submitted form data into a Contact object for us. The method
    // then hands the Contact to the DAO for update, and finally redirects to
    // the displayContactListNoAjax controller endpoint.
    @RequestMapping(value = "/editAddressNoAjax", method = RequestMethod.POST)
    public String editAddressNoAjax(@Valid @ModelAttribute("address") Address address,
                                    BindingResult result) {
        
        if (result.hasErrors()) {
            return "displayEditAddressFormNoAjax";
        }
        
        dao.updateAddress(address);
        return "redirect:displayAddressBookNoAjax";
    }

    @RequestMapping(value = "/displaySearchAddressFormNoAjax", method = RequestMethod.GET)
    public String displaySearchAddressFormNoAjax() {
        return "displaySearchAddressFormNoAjax";
    }

    @RequestMapping(value = "/searchAddressNoAjax", method = RequestMethod.POST)
    public String searchAddressNoAjax(HttpServletRequest req, Model model) {

        Map<SearchTerm, String> criteria = new HashMap<>();
        criteria.put(SearchTerm.FIRST_NAME, req.getParameter("firstName"));
        criteria.put(SearchTerm.LAST_NAME, req.getParameter("lastName"));
        criteria.put(SearchTerm.ADDRESS, req.getParameter("address"));
        criteria.put(SearchTerm.CITY, req.getParameter("city"));
        criteria.put(SearchTerm.STATE, req.getParameter("state"));
        criteria.put(SearchTerm.ZIPCODE, req.getParameter("zipCode"));
        
        List<Address> addressList = dao.searchAddresses(criteria);
        
        model.addAttribute("searchList", addressList);

        return "displaySearchResultsNoAjax";
    }
}
