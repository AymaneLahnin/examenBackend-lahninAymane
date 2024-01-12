package com.example.examen.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;
    private Float amount;

    @ManyToOne
    @JoinColumn(name = "orderPaymentId",referencedColumnName = "id")
    private Order orderPayment;
}
