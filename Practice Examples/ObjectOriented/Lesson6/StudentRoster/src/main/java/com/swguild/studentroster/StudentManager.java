/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.studentroster;


import com.swguild.studentroster.controller.StudentController;
import com.swguild.studentroster.dao.StudentRosterFileImpl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mgaffney
 */
public class StudentManager {
    public static void main(String[] args) {
        new StudentController(new StudentRosterFileImpl("Students.txt")).run();
    }
}
