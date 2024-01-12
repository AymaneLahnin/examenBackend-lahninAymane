package com.example.examen.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate date;
    private String status;

    @OneToMany(mappedBy = "order")
    private List<OrdreDetail> ordreDetails;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<Payment> payments;
    public Double calcSubTotal(){
        return 1000.0;
    }

    public Double calcTax(){
        return 1000.0;
    }

    public Double calcTotal(){
        return 50000.3;
    }

    public Double calcTotalWeight(){
        return 10000.3;
    }
}
