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
public class PeopleProgram {

    public static void main(String[] args) {
        People pl = new People();
        
        People.Student studentObject = pl.new Student("Jake");
        studentObject.saying();

        People.Employee employeeObject = pl.new Employee("Abrahm");
        employeeObject.saying();
        
        People.Manager managerObject = pl.new Manager("Alex");
        managerObject.saying();
    }
}
