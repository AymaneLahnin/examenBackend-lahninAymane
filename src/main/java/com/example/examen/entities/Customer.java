package com.example.examen.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    private String name;
    private String adress;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
