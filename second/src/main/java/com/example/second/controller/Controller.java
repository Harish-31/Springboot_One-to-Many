package com.example.second.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.second.model.Employee;
import com.example.second.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class Controller {
    
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public ResponseEntity<String> saveEmployee(@RequestBody List<Employee> empData){
            employeeRepository.saveAll(empData);
            return ResponseEntity.ok("Data Saved");
    }        
}
