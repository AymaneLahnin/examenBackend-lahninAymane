package com.example.examen.services;

import com.example.examen.entities.Customer;
import com.example.examen.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findCustomers(){
        return customerRepository.findAll();
    }

    public Customer findCustomerById(Long customerId){
        return customerRepository.findById(customerId).get();
    }

    public void supprimerCustomer(Long customerId){
        customerRepository.deleteById(customerId);
    }


    public Customer createNewCustomer(Customer newCustomer){
        this.customerRepository.save(newCustomer);
        return newCustomer;
    }


}
