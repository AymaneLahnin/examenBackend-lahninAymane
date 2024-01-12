package com.example.examen.services;

import com.example.examen.entities.Order;
import com.example.examen.repositories.CustomerRepository;
import com.example.examen.repositories.OrderDetailRepository;
import com.example.examen.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository=orderRepository;
    }

    public List<Order> getOrders(){
        return this.orderRepository.findAll();
    }
    public void deleteOrder(Long id){
        this.orderRepository.deleteById(id);
    }

    public Order addNewOrder(Order newOrder){
        return this.orderRepository.save(newOrder);
    }
}
