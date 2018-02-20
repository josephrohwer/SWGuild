/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.dao;

import com.mycompany.addressbook.dto.Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author josephrohwer
 */
public class AddressBook implements AddressBookInterface {

    private final AddressDataAccess dao = new AddressDataAccess();
    private final ArrayList<Address> addresses = new ArrayList<>();

    public AddressBook() {
        try {
            addresses.addAll(dao.readAddresses());
        } catch (Exception e) {
        }
    }

    @Override
    public Address addAddress(Address addAddress) {
        addresses.add(addAddress);
        try {
            dao.writeAddresses(addresses);
        } catch (Exception e) {
        }
        return addAddress;
    }
    
    @Override
    public List<Address> getAddresses() {
        return new ArrayList<>(addresses);
    }

    @Override
    public void removeAddress(String lastName) {
        for (int i = 0; i < addresses.size(); i++) {
            if (addresses.get(i).getLastName().equals(lastName)) {
                addresses.remove(i);
                break;
            }
        }
        try {
            dao.writeAddresses(addresses);
        } catch (Exception e) {
        }
    }

    @Override
    public List<Address> findAddress(String lastName) {
        List<Address> addressTemp
                = addresses.stream().filter(a -> a.getLastName().equals(lastName)).collect(Collectors.toList());

        return addressTemp;
    }

    @Override
    public List<Address> findAddressCity(String city) {
        List<Address> addressTemp
                = addresses.stream().filter(a -> a.getCity().equals(city)).collect(Collectors.toList());

        return addressTemp;
    }

    @Override
    public Map<String, List<Address>> findAddressState(String state) {

        Map<String, List<Address>> addressTemp
                = addresses.stream()
                        .filter(a -> a.getState().equals(state))
                        .collect(Collectors.groupingBy(Address::getCity));
        
        return addressTemp;
    }

    @Override
    public List<Address> findAddressZip(String zipcode) {
        List<Address> addressTemp
                = addresses.stream().filter(a -> a.getZip().equals(zipcode)).collect(Collectors.toList());

        return addressTemp;
    }

    @Override
    public int addressCount() {
        int size = addresses.size();
        return size;
    }

    @Override
    public List<Address> addressList() {
        List<Address> addressTemp = new ArrayList<>();

        addresses.stream().forEach((a) -> {
            addressTemp.add(a);
        });
        return addressTemp;
    }
}
