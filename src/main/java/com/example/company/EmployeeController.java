package com.example.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnel")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping
    public ResponseEntity<List<Employee>> getAllPersonnel() {
        return new ResponseEntity<List<Employee>>(employeeService.allPersonnel(), HttpStatus.OK);
    }
}
