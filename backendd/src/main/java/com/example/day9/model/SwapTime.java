package com.example.day9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SwapTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empName;
    private String department;
    private String requestDate;
    private String shiftDetails;
    private String swapWith;
    private String reason;

    // Constructors, getters, and setters

    public SwapTime() {
    }

    public SwapTime(Long id, String empName, String department, String requestDate, String shiftDetails, String swapWith, String reason) {
        this.id = id;
        this.empName = empName;
        this.department = department;
        this.requestDate = requestDate;
        this.shiftDetails = shiftDetails;
        this.swapWith = swapWith;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getShiftDetails() {
        return shiftDetails;
    }

    public void setShiftDetails(String shiftDetails) {
        this.shiftDetails = shiftDetails;
    }

    public String getSwapWith() {
        return swapWith;
    }

    public void setSwapWith(String swapWith) {
        this.swapWith = swapWith;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
