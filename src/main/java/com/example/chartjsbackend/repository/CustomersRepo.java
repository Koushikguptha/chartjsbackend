package com.example.chartjsbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chartjsbackend.model.Customers;


public interface CustomersRepo extends JpaRepository<Customers,Long>{


    
} 
