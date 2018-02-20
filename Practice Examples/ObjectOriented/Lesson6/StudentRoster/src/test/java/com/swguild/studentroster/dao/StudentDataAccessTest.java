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
import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mgaffney
 */
public class StudentDataAccessTest {

    StudentDataAccess dao = new StudentDataAccess();
    
    public StudentDataAccessTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("StudentTests.txt"));
            out.flush();
            out.close();

        } catch (IOException e) {
            //no action needed
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of writeStudents method, of class StudentDataAccess.
     */
    @Test
    public void testWriteStudents() {
        System.out.println("writeStudents");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Betty", "Rubble", "0001", "Java_January_2017"));
        students.add(new Student("Barney", "Rubble", "0002", "J.Net_January_2017"));
        dao.writeStudents(students, "StudentTests.txt");

        ArrayList<Student> students2 = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("StudentTests.txt")));
            String temp;
            String[] tempStrings;

            while (sc.hasNextLine()) {
                temp = sc.nextLine();
                tempStrings = temp.split("::");
                students2.add(new Student(tempStrings[1], tempStrings[2], tempStrings[0], tempStrings[3]));
            }
        } catch (FileNotFoundException e) {
            //No relevant action to be performed
        }

        assertEquals(students.size(), students2.size());
        assertTrue(students.get(0).equals(students2.get(0)));
    }

    /**
     * Test of readStudents method, of class StudentDataAccess.
     */
    @Test
    public void testReadStudents() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("StudentTests.txt"));
            out.println("0001::Student::One::Java_May_2016");
            out.println("0002::Other::Student::Java_February_2016");
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("Write failed.");
        }
        
        List<Student> students = dao.readStudents("StudentTests.txt");
        
        assertEquals(students.size(), 2);
        assertEquals(students.get(0).getFirstName(), "Student");
    }

}
