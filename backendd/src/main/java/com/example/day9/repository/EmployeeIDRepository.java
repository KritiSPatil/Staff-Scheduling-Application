package com.example.day9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day9.model.EmployeeIDCard;

public interface EmployeeIDRepository extends JpaRepository<EmployeeIDCard,Long> {
    
}
