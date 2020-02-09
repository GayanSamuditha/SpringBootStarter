package com.gayan.demo.controller;

import com.gayan.demo.model.Employee;
import com.gayan.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employeeServices")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee) {

        return  employeeService.save(employee);
    }

//    @RequestMapping("/employeeList")
//    public List<Employee> getAllEmployees() {
//
//        return employeeService.getAllEmployees();
//    }
}
