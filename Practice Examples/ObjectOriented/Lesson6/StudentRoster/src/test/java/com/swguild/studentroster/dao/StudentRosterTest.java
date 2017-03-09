/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.studentroster.dao;

import com.swguild.studentroster.dto.Student;
import java.util.ArrayList;
import java.util.List;
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
public class StudentRosterTest {
    StudentRoster instance;
    List<Student> startingStudents;
    public StudentRosterTest() {
        instance = new StudentRosterFileImpl("StudentTestFile.txt");
        startingStudents = new ArrayList<>();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //setUp occurs before each test method.
        //we use it to ensure that the DAO being tested is in a 
        
        //first erase whatever happens to be in the DAO and in our local copy
        startingStudents.clear();
        List<Student> students = instance.getStudents();
        for (Student s : students) {
            instance.removeStudent(s.getStudentId());
        }
        
        //then add known data into the DAO and our local copy
        startingStudents.add(instance.addStudent(new Student("Bruce", "Campbell", null, "Java Minneapolis 09/16")));
        startingStudents.add(instance.addStudent(new Student("Tonya", "Harding", null, ".Net Minneapolis 09/16")));
        startingStudents.add(instance.addStudent(new Student("Nancy", "Kerrigan", null, "Java Minneapolis 09/16")));
        startingStudents.add(instance.addStudent(new Student("Bill", "LeChat", null, ".Net Minneapolis 09/16")));
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getStudents method, of class StudentRoster.
     */
    @Test
    public void testGetStudents() {
        //Note that this is dependant on add having worked properly in setUp.
        //This is normal.  Without directly accessing the database or files, it's the best we can do.
        //by having file reading and writing in a separate class, we can test that separately, if we like.
        System.out.println("getStudents");

        List<Student> expResult = startingStudents;
        List<Student> result = instance.getStudents();
        //assertEquals(expResult, result);//BAD!  Interface doesn't guarantee order.
        assertEquals(expResult.size(), result.size());
        for(Student s: expResult) {
            assertTrue(s.toString() + " is not in the results.", result.contains(s));
        }

    }

    /**
     * Test of addStudent method, of class StudentRoster.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student e = instance.addStudent(new Student("Buckaroo", "Bonzai", null, ".Net Minneapolis 09/16"));
        Student r = instance.getStudentById(e.getStudentId());
        List<Student> l = instance.getStudents();
        assertEquals(e, r);
        assertTrue("Student not found in list", l.contains(e));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCohorts method, of class StudentRoster.
     */
    @Test
    public void testGetCohorts() {
        System.out.println("getCohorts");
        List<String> expResult = null;
        List<String> result = instance.getCohorts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentById method, of class StudentRoster.
     */
    @Test
    public void testGetStudentById() {
        System.out.println("getStudentById");
        String id = "";
        Student expResult = null;
        Student result = instance.getStudentById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentsByCohort method, of class StudentRoster.
     */
    @Test
    public void testGetStudentsByCohort() {
        System.out.println("getStudentsByCohort");
        String co = "";
        List<Student> expResult = null;
        List<Student> result = instance.getStudentsByCohort(co);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudent method, of class StudentRoster.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        String studentId = "";
        instance.removeStudent(studentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
