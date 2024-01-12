package com.example.examen.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Credit extends Payment {
    private String number;
    private String type;
    private LocalDate expDate;

    public Boolean authorized(){
        return true;
    }
}
