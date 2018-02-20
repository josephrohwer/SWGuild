/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dao;

import com.mycompany.vendingmachine.dto.Vending;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface VendingMachineInterface {
    
    void updateInventory(int item);
    
    List<Vending> listItems();
    
}