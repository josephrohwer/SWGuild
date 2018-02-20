/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.studentroster.dao;


import com.swguild.studentroster.dao.StudentDataAccess;
import com.swguild.studentroster.dto.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author mgaffney
 */
public class StudentRosterFileImpl implements StudentRoster {
    private List<Student> students;
    private StudentDataAccess dao = new StudentDataAccess();
    private final String file;
    private int nextId;
    
    public StudentRosterFileImpl(String fileIn) {
        file = fileIn;
        students = dao.readStudents(file);

        ArrayList<String> ids = new ArrayList<>();
        for (Student s : students) {
            ids.add(s.getStudentId());
        }
        if (ids.size() > 0) {
            String max = ids.get(0);
            for (String id : ids) {
                if (id.compareTo(max) > 0) {
                    max = id;
                }
            }
            nextId = Integer.parseInt(max) + 1;
        } else {
            nextId = 1;
        }
    }
    
    @Override
    public Student getStudentById(String id) {

        for(Student s : students) {
            if (s.getStudentId().equals(id)) {
                return s;
            }
        }
        return null;
    }
    
    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(students);
        //return students;
    }
    
    @Override
    public Student addStudent(Student s) {
        String sid, zeros = "";
        sid = String.valueOf(nextId);
        for (int i = 0; i < 4 - sid.length(); i++) {
            zeros += 0;
        }
        sid = zeros + sid;
        nextId++;
        s.setStudentId(sid);
        students.add(s);
        dao.writeStudents(students, file);   
        return s;
    }
    
    @Override
    public List<String> getCohorts() {
        Set<String> cohortSet = new HashSet<>();
        for (Student s : students) {
            cohortSet.add(s.getCohort());
        }
        return new ArrayList<>(cohortSet);
    }
    
    @Override
    public List<Student> getStudentsByCohort(String co) {
        List<Student> stu = new ArrayList<>();
        for (Student s : students) {
            if(s.getCohort().equals(co)) {
              stu.add(s);
            }
        }
        return stu;
    }
    
    @Override
    public void removeStudent(String studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)) {
                students.remove(i);
                break;
            }
        }
        dao.writeStudents(students, file);
    }
}
