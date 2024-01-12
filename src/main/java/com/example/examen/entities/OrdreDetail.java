package com.example.examen.entities;

import jakarta.persistence.*;

@Entity
public class OrdreDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderDetailId;
    private Long quantity;
    private String  taxStatus;


    @ManyToOne
    @JoinColumn(name = "odId",referencedColumnName = "id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "itemDetailId",referencedColumnName = "itemId")
    private Item item;
    public Double calcSubTotal(){
        return  120.36;
    }

    public Double calcWeight(){
        return 1236.3;
    }

    public Double calcTaxt(){
        return 1234.2;
    }
}
