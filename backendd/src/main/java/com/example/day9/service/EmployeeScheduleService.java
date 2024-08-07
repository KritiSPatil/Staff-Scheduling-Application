package com.example.day9.service;

import com.example.day9.model.EmployeeSchedule;
import com.example.day9.repository.EmployeeScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeScheduleService {

    @Autowired
    private EmployeeScheduleRepository employeeScheduleRepository;

    public List<EmployeeSchedule> getAllSchedules() {
        return employeeScheduleRepository.findAll();
    }

    public Optional<EmployeeSchedule> getScheduleById(Long id) {
        return employeeScheduleRepository.findById(id);
    }

    public EmployeeSchedule createSchedule(EmployeeSchedule employeeSchedule) {
        return employeeScheduleRepository.save(employeeSchedule);
    }

    public EmployeeSchedule updateSchedule(Long id, EmployeeSchedule scheduleDetails) {
        EmployeeSchedule schedule = employeeScheduleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));
        schedule.setEmpId(scheduleDetails.getEmpId());
        schedule.setEmpName(scheduleDetails.getEmpName());
        schedule.setEmail(scheduleDetails.getEmail());
        schedule.setGender(scheduleDetails.getGender());
        schedule.setDate(scheduleDetails.getDate());
        schedule.setShift(scheduleDetails.getShift());
        schedule.setSkills(scheduleDetails.getSkills());
        schedule.setContactNum(scheduleDetails.getContactNum());
        schedule.setStartTime(scheduleDetails.getStartTime());
        schedule.setEndTime(scheduleDetails.getEndTime());
        schedule.setDep(scheduleDetails.getDep());
        return employeeScheduleRepository.save(schedule);
    }

    public void deleteSchedule(Long id) {
        employeeScheduleRepository.deleteById(id);
    }
}
