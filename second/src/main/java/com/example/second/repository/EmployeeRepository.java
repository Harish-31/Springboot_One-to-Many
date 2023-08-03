package com.example.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.second.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
