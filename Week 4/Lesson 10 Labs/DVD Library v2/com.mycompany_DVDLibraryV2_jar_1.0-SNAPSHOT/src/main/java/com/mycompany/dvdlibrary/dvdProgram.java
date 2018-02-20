/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary;

import com.mycompany.dvdlibrary.controller.dvdController;
import com.mycompany.dvdlibrary.dao.dvdLibrary;

/**
 *
 * @author apprentice
 */
public class dvdProgram {
    public static void main(String[] args) {
        new dvdController(new dvdLibrary()).displayMenu();
    }
}
