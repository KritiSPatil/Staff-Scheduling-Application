package com.example.day9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class EmployeeSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    private int empId;
    private String empName;
    private String email;
    private String gender;
    private LocalDate date;
    private String shift;
    private String skills;
    private Long contactNum;
    private String startTime;
    private String endTime;
    private String dep;

    // Constructors, getters, and setters

    public EmployeeSchedule() {
    }

    public EmployeeSchedule(Long scheduleId, int empId, String empName, String email, String gender, LocalDate date, String shift, String skills, Long contactNum, String startTime, String endTime, String dep) {
        this.scheduleId = scheduleId;
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.date = date;
        this.shift = shift;
        this.skills = skills;
        this.contactNum = contactNum;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dep = dep;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Long getContactNum() {
        return contactNum;
    }

    public void setContactNum(Long contactNum) {
        this.contactNum = contactNum;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
