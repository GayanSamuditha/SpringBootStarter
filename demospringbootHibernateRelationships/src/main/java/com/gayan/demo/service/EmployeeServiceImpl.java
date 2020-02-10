package com.gayan.demo.service;

import com.gayan.demo.model.Employee;
import com.gayan.demo.model.Telephone;
import com.gayan.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {

        for (Telephone telephone:employee.getTelephones()) {
            telephone.setEmployee(employee);
        }

        return employeeRepository.save(employee);


    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


}
