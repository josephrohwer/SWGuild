/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flooringmasterybasic.dao;

import com.mycompany.flooringmasterybasic.dto.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDAOProd implements ProductDAO {

    @Override
    public List<Product> run() {
        List<Product> products = new ArrayList<>();
        try (Scanner kb = new Scanner(new BufferedReader(new FileReader("Data/ProductTypes.txt")))) {
            String temp;
            String[] tempStrings;

            while (kb.hasNextLine()) {
                temp = kb.nextLine();
                tempStrings = temp.split(",");
                products.add(new Product(tempStrings[0], Double.parseDouble(tempStrings[1]), Double.parseDouble(tempStrings[2])));
            }
        } catch (FileNotFoundException e) {
        }

        return products;
    }
}
