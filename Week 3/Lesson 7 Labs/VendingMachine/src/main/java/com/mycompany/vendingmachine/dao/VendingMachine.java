/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dao;

import com.mycompany.vendingmachine.dto.Vending;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josephrohwer
 */
public class VendingMachine implements VendingMachineInterface {

    ArrayList<Vending> info = new ArrayList<>();
    private VendingMachineDataAccess dao = new VendingMachineDataAccess();

    public VendingMachine() {
        try {
            info.addAll(dao.readInfo());
        } catch (Exception ex) {
        }
    }

    @Override
    public void updateInventory(int item) {
        int a = info.get(item - 1).getInventory();
        a = (a - 1);
        info.get(item - 1).setInventory(a);
            
        try {
            dao.writeInfo(info);
        } catch (Exception ex) {
        }
    }

    @Override
    public List<Vending> listItems() {
        List<Vending> itemTemp = new ArrayList<>();

        info.stream().forEach((v) -> {
            itemTemp.add(v);
        });
        return itemTemp;
    }
}
