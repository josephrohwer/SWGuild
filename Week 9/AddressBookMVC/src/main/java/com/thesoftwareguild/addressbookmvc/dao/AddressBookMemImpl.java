/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.dao;

import com.thesoftwareguild.addressbookmvc.dto.Address;
import com.thesoftwareguild.addressbookmvc.dto.StateAddressCount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author josephrohwer
 */
public class AddressBookMemImpl implements AddressBook {

    private Map<Integer, Address> addressMap = new HashMap<>();
    private static int addressIdCounter = 0;

    @Override
    public Address addAddress(Address address) {
        address.setAddressId(addressIdCounter);
        addressIdCounter++;
        addressMap.put(address.getAddressId(), address);
        return address;
    }

    @Override
    public void removeAddress(int addressId) {
        addressMap.remove(addressId);
    }

    @Override
    public void updateAddress(Address address) {
        addressMap.put(address.getAddressId(), address);
    }

    @Override
    public List<Address> getAllAddresses() {
        Collection<Address> a = addressMap.values();
        return new ArrayList(a);
    }

    @Override
    public Address getAddress(int addressId) {
        return addressMap.get(addressId);
    }

    @Override
    public List<Address> searchAddresses(Map<SearchTerm, String> criteria) {
        String firstNameCriteria = criteria.get(SearchTerm.FIRST_NAME);
        String lastNameCriteria = criteria.get(SearchTerm.LAST_NAME);
        String streetAddressCriteria = criteria.get(SearchTerm.ADDRESS);
        String cityCriteria = criteria.get(SearchTerm.CITY);
        String stateCriteria = criteria.get(SearchTerm.STATE);
        String zipCriteria = criteria.get(SearchTerm.ZIPCODE);

        Predicate<Address> firstNameMatches;
        Predicate<Address> lastNameMatches;
        Predicate<Address> addressMatches;
        Predicate<Address> cityMatches;
        Predicate<Address> stateMatches;
        Predicate<Address> zipcodeMatches;

        Predicate<Address> truePredicate = (c) -> {
            return true;
        };

        firstNameMatches = (firstNameCriteria == null || firstNameCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getFirstName().equalsIgnoreCase(firstNameCriteria);

        lastNameMatches = (lastNameCriteria == null || lastNameCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getLastName().equalsIgnoreCase(lastNameCriteria);

        addressMatches = (streetAddressCriteria == null || streetAddressCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getAddress().equalsIgnoreCase(streetAddressCriteria);

        cityMatches = (cityCriteria == null || cityCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getCity().equalsIgnoreCase(cityCriteria);

        stateMatches = (stateCriteria == null || stateCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getState().equalsIgnoreCase(stateCriteria);

        zipcodeMatches = (zipCriteria == null || zipCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getZipCode().equals(zipCriteria);

        return addressMap.values().stream()
                .filter(firstNameMatches
                        .and(lastNameMatches)
                        .and(addressMatches)
                        .and(cityMatches)
                        .and(stateMatches)
                        .and(zipcodeMatches))
                .collect(Collectors.toList());

    }

    @Override
    public List<StateAddressCount> getStateAddressCounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
