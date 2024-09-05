package com.example.chartjsbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chartjsbackend.model.Customers;

import java.util.List;

@Service
public class CustomersService {

    @Autowired
    private CustomersService customersRepo;

    // Method to retrieve all customers
    public List<Customers> getAllCustomers() {
        return customersRepo.findAll();
    }

    private List<Customers> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    // public Customers saveCustomer(Customers customer) {
    //     return customersRepo.save(customer);
    // }
}
