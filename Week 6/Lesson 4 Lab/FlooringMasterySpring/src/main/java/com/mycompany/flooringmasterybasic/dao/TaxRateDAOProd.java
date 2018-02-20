/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dao;

import com.mycompany.flooringmasterybasic.dto.TaxRate;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxRateDAOProd implements TaxRateDAO {

    @Override
    public List<TaxRate> run() {
        List<TaxRate> rate = new ArrayList<>();
        try (Scanner kb = new Scanner(new BufferedReader(new FileReader("Data/TaxRates.txt")))) {
            String temp;
            String[] tempStrings;

            while (kb.hasNextLine()) {
                temp = kb.nextLine();
                tempStrings = temp.split(",");
                rate.add(new TaxRate(tempStrings[0], Double.parseDouble(tempStrings[1])));
            }
        } catch (FileNotFoundException e) {
        }

        return rate;
    }
}
