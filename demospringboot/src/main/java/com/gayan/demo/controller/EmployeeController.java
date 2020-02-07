package com.gayan.demo.controller;

import com.gayan.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@RestController
@RequestMapping("employeeServices")
@XmlRootElement
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Employee.getAllEmployees();
    }
}
