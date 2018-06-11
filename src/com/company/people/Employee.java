package com.company.people;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {

    private int employeeNumber;
    private String jobTitle;
    private String hireDate;
    private String hours;

    //employee array list
    private List<Employee> employeeList = new ArrayList<Employee>();



    //default constructor
    public Employee() {
    }


    //constructor
    public Employee(int age, String name, char gender, String race, int employeeNumber, String jobTitle, String hireDate) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
    }

    //getters and setters
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    //employee number cannot change

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDate() {
        return hireDate;
    }
    //hire date cannot change

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }


    public void addEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
        //tells them the name that they input for the new employee (shows they entered right info)
        System.out.println(newEmployee.getName() + " has been added. ");
    }


}


