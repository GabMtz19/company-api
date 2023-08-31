package com.example.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> allPersonnel() {
        return employeeRepository.findAll();
    }

    public String getMessage() {
        return "Hello!";
    }
}
