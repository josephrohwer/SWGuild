/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.dao;

import com.thesoftwareguild.addressbookmvc.dto.Address;
import com.thesoftwareguild.addressbookmvc.dto.StateAddressCount;
import java.util.List;
import java.util.Map;

/**
 *
 * @author josephrohwer
 */
public interface AddressBook {

    public Address addAddress(Address address);

    public void removeAddress(int addressId);

    public void updateAddress(Address address);

    public List<Address> getAllAddresses();

    public Address getAddress(int addressId);

    public List<Address> searchAddresses(Map<SearchTerm, String> criteria);
    
    public List<StateAddressCount> getStateAddressCounts();
}
