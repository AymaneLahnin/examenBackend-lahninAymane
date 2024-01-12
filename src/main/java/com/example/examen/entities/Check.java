package com.example.examen.entities;

import jakarta.persistence.Entity;

@Entity
public class Check extends Payment{
    private String name;
    private String bankId;
    public boolean authorized(){
        return true;
    }
}
