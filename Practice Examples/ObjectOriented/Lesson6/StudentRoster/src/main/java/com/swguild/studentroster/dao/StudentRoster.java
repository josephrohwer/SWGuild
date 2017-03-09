/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.studentroster.dao;

import com.swguild.studentroster.dto.Student;
import java.util.List;

/**
 *
 * @author mgaffney
 */
public interface StudentRoster {

    Student addStudent(Student s);

    List<String> getCohorts();

    Student getStudentById(String id);

    List<Student> getStudents();

    List<Student> getStudentsByCohort(String co);

    void removeStudent(String studentId);
    
}
