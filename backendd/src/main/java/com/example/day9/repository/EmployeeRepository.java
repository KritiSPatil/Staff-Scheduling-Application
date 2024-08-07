package com.example.day9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day9.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
