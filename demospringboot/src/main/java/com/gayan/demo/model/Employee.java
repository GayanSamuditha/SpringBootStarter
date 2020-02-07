package com.gayan.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String studentName;

    private int studentMarks;

    public Employee(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public static List<Employee> getAllEmployees() {

        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee("Jane", 77));
        employeesList.add(new Employee("Albert", 82));
        employeesList.add(new Employee("Jenifer", 65));
        employeesList.add(new Employee("Rihana", 92));
        employeesList.add(new Employee("Neo", 83));
        employeesList.add(new Employee("Akon", 47));
        employeesList.add(new Employee("Sean", 27));

        return employeesList;
        
    }
}
