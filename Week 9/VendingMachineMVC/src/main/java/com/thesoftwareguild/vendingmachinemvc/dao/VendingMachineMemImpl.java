/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.vendingmachinemvc.dao;

import com.thesoftwareguild.vendingmachinemvc.dto.Change;
import com.thesoftwareguild.vendingmachinemvc.dto.Vending;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author josephrohwer
 */
public class VendingMachineMemImpl implements VendingMachine {

    private List<Vending> items = new ArrayList<>();
    Vending VendingDTO = new Vending();
    Change ChangeDTO = new Change();

    @Override
    public void updateInventory(int item) {
        int a = items.get(item - 1).getInventory();
        a = (a - 1);
        if (a >= 0) {
            items.get(item - 1).setInventory(a);
        }
    }

    @Override
    public List<Vending> listItems() {
        List<Vending> itemTemp = new ArrayList<>(items);
        return itemTemp;
    }

    @Override
    public Vending addItem(Vending vending) {
        items.add(vending);
        return vending;
    }

    @Override
    public Change setAmount(double startingAmount) {
        ChangeDTO.setAmount(startingAmount);
        return ChangeDTO;
    }

    @Override
    public Change setCost(int selection) {
        double money = ChangeDTO.getAmount();

        switch (selection) {
            case 1:
                VendingDTO.setCost(2.29);
                break;
            case 2:
                VendingDTO.setCost(1.99);
                break;
            case 3:
                VendingDTO.setCost(2.79);
                break;
            case 4:
                VendingDTO.setCost(1.49);
                break;
            default:
                break;
        }

        if (VendingDTO.getCost() > money) {
            //System.out.println("Insufficient funds. You have " + money);
        } else if (VendingDTO.getCost() <= money) {
            updateInventory(selection);
        }

        return ChangeDTO;
    }

    @Override
    public Change makeChange() {

        double startingAmount = ((ChangeDTO.getAmount() - VendingDTO.getCost()) * 100);
        startingAmount = startingAmount * 100;
        startingAmount = Math.round(startingAmount);
        startingAmount = startingAmount / 100;

        int quarter = 25;
        int quarterTotal = 0;
        int dime = 10;
        int dimeTotal = 0;
        int nickel = 5;
        int nickelTotal = 0;
        int penny = 1;
        int pennyTotal = 0;

        do {
            while (quarter <= startingAmount) {
                quarterTotal++;
                startingAmount -= quarter;
            }
            while (dime <= startingAmount) {
                dimeTotal++;
                startingAmount -= dime;
            }
            while (nickel <= startingAmount) {
                nickelTotal++;
                startingAmount -= nickel;
            }
            while (penny <= startingAmount) {
                pennyTotal++;
                startingAmount -= penny;
            }
        } while (startingAmount > 0);

        ChangeDTO.setQuarterTotal(quarterTotal);
        ChangeDTO.setDimeTotal(dimeTotal);
        ChangeDTO.setNickelTotal(nickelTotal);
        ChangeDTO.setPennyTotal(pennyTotal);

        return ChangeDTO;
    }
}
