/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swguild.studentroster.dto;

/**
 *
 * @author mgaffney
 */
public class Student {

    private String firstName;
    private String lastName;
    private String studentId;
    private String cohort; // Java or .NET + cohort month/year
    
    public Student(String firstName, String lastName, String studentId, String cohort) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.cohort = cohort;
    }

    public Student(String studentIdIn) {
        studentId = studentIdIn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
    
    public String toString(){
        return studentId + ": " + firstName + " " + lastName + ", " + cohort;
    }
    
    //this is as close to a canonical "always do this" equals method
    //as there would be.
    public boolean equals(Object o) {
        if(o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        Student s = (Student)o;
        return firstName.equals(s.firstName)
                && lastName.equals(s.lastName)
                //&& studentId.equals(s.studentId)
                && cohort.equals(s.cohort);
        
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
}
