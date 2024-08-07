package com.example.day9.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    String name;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="card_id",referencedColumnName = "id")
    private EmployeeIDCard StudentIDCard;
    
    public EmployeeIDCard getStudentIDCard() {
        return StudentIDCard;
    }
    public void setStudentIDCard(EmployeeIDCard studentIDCard) {
        StudentIDCard = studentIDCard;
    }
    
    public Employee(com.example.day9.model.EmployeeIDCard studentIDCard) {
        StudentIDCard = studentIDCard;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee() {
    }
    
}