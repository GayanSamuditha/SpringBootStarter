package com.gayan.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;
    private String studentName;

    private String city;

    public Employee(String studentName, String city) {
        this.studentName = studentName;
        this.city = city;
    }

    public Employee() { }


    public String getName() {
        return studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() {
        return studentId;
    }

    public void setId(Integer id) {
        this.studentId = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
