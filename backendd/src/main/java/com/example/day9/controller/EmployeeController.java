package com.example.day9.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day9.model.Employee;
import com.example.day9.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService ss;
    
    @PostMapping("/student")
    public ResponseEntity<?> posts(@RequestBody Employee s)
    {
        try
        {
            return new ResponseEntity<>(ss.posts(s),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/student")
    public ResponseEntity<?> getd()
    {
        try{
            return new ResponseEntity<>(ss.get(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<?> getId(@PathVariable Long id)
    {
        try{
            return new ResponseEntity<>(ss.getById(id),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<?> putd(@PathVariable Long id,@RequestBody Employee student)
    {
        try{
            return new ResponseEntity<>(ss.putt(id, student),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> deleted(@PathVariable Long id)
    {
        try{
            return new ResponseEntity<>(ss.deleted(id),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}