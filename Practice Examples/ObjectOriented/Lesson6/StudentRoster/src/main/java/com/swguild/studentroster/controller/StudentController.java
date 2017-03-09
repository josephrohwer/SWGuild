/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.studentroster.controller;


import com.swguild.studentroster.dao.StudentRoster;
import com.swguild.studentroster.dao.StudentRosterFileImpl;
import com.swguild.studentroster.dto.Student;
import com.swguild.studentroster.ui.ConsoleIO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author mgaffney
 */
public class StudentController {

    private StudentRoster students;
    
    private ConsoleIO console = new ConsoleIO();
    
    

    public StudentController(StudentRoster sr) {
        students = sr;
    }

    public void run() {
        int choice;
        do {
            console.write("Please chose an option: \n"
                    + "1: List all students\n"
                    + "2: List students by cohort\n"
                    + "3: Add a student\n"
                    + "4: Remove a student\n"
                    + "5: Exit\n"
                    + "> ");
            choice = console.readInteger("", 1, 5);

            switch (choice) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    listStudentsByCohort();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:

            }

        } while (choice != 5);
    }

    private void listStudents() {
        Iterator<Student> iter = students.getStudents().iterator();
        //keeping iterator for the heck of it (and less refactoring)
        console.write("All students: \n");
        while(iter.hasNext()) {
            Student s = iter.next();
            console.write(s.getFirstName() + ' ' + s.getLastName() + '\n');
        }
        console.write("\n");
    }

    private void addStudent() {
        String fname, lname, cohort;
        fname = console.readString("First name: ");
        lname = console.readString("Last Name: ");
        cohort = console.readString("Cohort: ");
        
        students.addStudent(new Student(fname, lname, null,  cohort));

    }

    private void listStudentsByCohort() {
        List<String> cohortList = students.getCohorts();
        List<Student> cohortStudents;
        int choice;
        
        console.write("Choose a cohort to display: \n");
        for (int i = 1; i <= cohortList.size(); i++) {
            console.write(i + ": " + cohortList.get(i - 1) + "\n");
        }
        choice = console.readInteger("> ", 1, cohortList.size()) - 1;
        cohortStudents = students.getStudentsByCohort(cohortList.get(choice));
        
        for(Student s : cohortStudents) {
            console.write(s.getFirstName() + " " + s.getLastName() + "\n");    
        }
        
        console.write("\n");
    }

    private void removeStudent() {
        String sid;
        console.write("\n");
        Iterator<Student> iter = students.getStudents().iterator();
        while(iter.hasNext()) {
            Student s = iter.next();
            console.write(s.toString() + "\n");
        }
        sid = console.readString("Enter Student ID of student to remove: ");
        students.removeStudent(sid);
        
    }

}
