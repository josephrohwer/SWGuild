/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;

/**
 *
 * @author apprentice
 */
public class People {

    public class Student {

        private String studentName;

        public Student(String name) {
            studentName = name;
        }

        public String getName() {
            return studentName;
        }

        public void saying() {
            System.out.println("The name of the student is " + getName());
        }
    }

    public class Employee {

        private String employeeName;

        public Employee(String name) {
            employeeName = name;
        }

        public String getName() {
            return employeeName;
        }

        public void saying() {
            System.out.println("The name of the employee is " + getName());
        }
    }

    public class Manager {

        private String managerName;

        public Manager(String name) {
            managerName = name;
        }

        public String getName() {
            return managerName;
        }

        public void saying() {
            System.out.println("The name of the manager is " + getName());
        }
    }
}
