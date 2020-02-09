package com.gayan.demo.service;

import com.gayan.demo.model.Employee;
import com.gayan.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }


}
