package com.example.day9.controller;

import com.example.day9.model.EmployeeSchedule;
import com.example.day9.service.EmployeeScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schedules")
public class EmployeeScheduleController {

    @Autowired
    private EmployeeScheduleService employeeScheduleService;

    @GetMapping
    public ResponseEntity<List<EmployeeSchedule>> getAllSchedules() {
        List<EmployeeSchedule> schedules = employeeScheduleService.getAllSchedules();
        return new ResponseEntity<>(schedules, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<EmployeeSchedule>> getScheduleById(@PathVariable Long id) {
        Optional<EmployeeSchedule> schedule = employeeScheduleService.getScheduleById(id);
        return new ResponseEntity<>(schedule, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmployeeSchedule> createSchedule(@RequestBody EmployeeSchedule employeeSchedule) {
        EmployeeSchedule savedSchedule = employeeScheduleService.createSchedule(employeeSchedule);
        return new ResponseEntity<>(savedSchedule, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeSchedule> updateSchedule(@PathVariable Long id, @RequestBody EmployeeSchedule scheduleDetails) {
        EmployeeSchedule updatedSchedule = employeeScheduleService.updateSchedule(id, scheduleDetails);
        return new ResponseEntity<>(updatedSchedule, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteSchedule(@PathVariable Long id) {
        employeeScheduleService.deleteSchedule(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
