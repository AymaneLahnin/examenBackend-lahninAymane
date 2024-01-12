package com.example.examen.entities;

import jakarta.persistence.Entity;

@Entity
public class Cash extends Payment {
    private Float cashTendered;
}
