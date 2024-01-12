package com.example.examen.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String shippingWeight;
    private String  description;

    @OneToMany(mappedBy = "item")
    private List<OrdreDetail> ordreDetailList;


    public Double getPriceForQuantity(){
        return 1000.4;
    }

    public Double getTax(){
        return 5000.2;
    }

    public Boolean inStock(){
        return true;
    }
}
