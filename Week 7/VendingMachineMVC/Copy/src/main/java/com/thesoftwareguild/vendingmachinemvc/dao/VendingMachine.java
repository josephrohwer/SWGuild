/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.vendingmachinemvc.dao;

import com.thesoftwareguild.vendingmachinemvc.dto.Change;
import com.thesoftwareguild.vendingmachinemvc.dto.Vending;
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public interface VendingMachine {

    void updateInventory(int item);

    List<Vending> listItems();
    
    Vending addItem(Vending vending);
    
    Change setAmount(double startingAmount);

    Change setCost(int selection);

    Change makeChange();
}
