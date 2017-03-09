/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.studentroster.dao;


import com.swguild.studentroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mgaffney
 */
public class StudentDataAccess {

    public void writeStudents(List<Student> students, String file)  {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file));
            for (Student stu : students) {
                out.println(stu.getStudentId()
                        + "::" + stu.getFirstName()
                        + "::" + stu.getLastName()
                        + "::" + stu.getCohort());
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("Write failed.");
        }

    }

    public List<Student> readStudents(String file)  {
        List<Student> students = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));
            String temp;
            String[] tempStrings;

            while (sc.hasNextLine()) {
                temp = sc.nextLine();
                tempStrings = temp.split("::");
                students.add(new Student(tempStrings[1], tempStrings[2], tempStrings[0], tempStrings[3]));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            //No relevant action to be performed
        }
        
        return students;
    }
}
