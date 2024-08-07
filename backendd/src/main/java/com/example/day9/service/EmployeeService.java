package com.example.day9.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day9.model.Employee;
import com.example.day9.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository ar;

    // Post
    public Employee posts(Employee a) {
        return ar.save(a);
    }

    // Get
    public List<Employee> get() {
        return ar.findAll();
    }

    // Get by ID
    public Optional<Employee> getById(Long id) {
        return ar.findById(id);
    }

    // Put
    public Employee putt(Long id, Employee studentDetails) {
        Optional<Employee> optionalStudent = ar.findById(id);
        if (optionalStudent.isPresent()) {
            Employee student = optionalStudent.get();
            student.setName(studentDetails.getName());
            student.setStudentIDCard(studentDetails.getStudentIDCard());
            return ar.save(student);
        }
        return null;
    }

    // Delete
    public String deleted(Long id) {
        Optional<Employee> optionalStudent = ar.findById(id);
        if (optionalStudent.isPresent()) {
            ar.deleteById(id);
            return "Deleted Employee successfully";
        }
        return "Employee with ID " + id + " not found";
    }
}