package com.example.day9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeIDCard {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    String cardNumber;

    @OneToOne(mappedBy ="StudentIDCard")
    private Employee student;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public EmployeeIDCard(long id, String cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }
    public EmployeeIDCard() {
    }
    
}