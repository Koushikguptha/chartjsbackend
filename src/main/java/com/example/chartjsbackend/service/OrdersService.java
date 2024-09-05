package com.example.chartjsbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chartjsbackend.model.Orders;
import com.example.chartjsbackend.repository.OrdersRepo;

@Service
public class OrdersService {
    @Autowired  
    private OrdersRepo ordersRepo;

    // public double calculateTotalSales() {
    //     List<Orders> ord = ordersRepo.findAll();
    //     return Orders.stream()
    //                  .mapToDouble(Orders::getTotalPrice)
    //                  .sum();
       // return 99.99;
    // }
    public List<Orders> getAllMethods()
    {
        return ordersRepo.findAll();
    }
  
}