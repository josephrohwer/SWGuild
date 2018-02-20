/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.dao;

import com.mycompany.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface AddressBookInterface {

    Address addAddress(Address addAddress);

    void removeAddress(String lastName);
    
    List<Address> getAddresses();

    List<Address> findAddress(String lastName);
    
    List<Address> findAddressCity(String city);
    
    List<Address> findAddressState(String state);
    
    List<Address> findAddressZip(String zipcode);

    int addressCount();

    List<Address> addressList();

}
