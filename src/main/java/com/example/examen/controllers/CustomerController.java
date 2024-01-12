package com.example.examen.controllers;

import com.example.examen.entities.Customer;
import com.example.examen.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return this.customerService.findCustomers();
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long customerId){
        this.customerService.supprimerCustomer(customerId);
    }

    @PostMapping
    public Customer addNewCustomer(@RequestBody Customer newCustomer){
        return this.customerService.createNewCustomer(newCustomer);
    }

}
