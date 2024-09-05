package com.example.chartjsbackend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chartjsbackend.*;
import com.example.chartjsbackend.model.Customers;
import com.example.chartjsbackend.model.Orders;
import com.example.chartjsbackend.service.CustomersService;
import com.example.chartjsbackend.service.OrdersService;


@RestController
 @RequestMapping("/fun")
public class CustomerController {
    public OrdersService ordersService;
    @Autowired CustomersService customersService;
     @Autowired public CustomerController(OrdersService ordersService){
    this.ordersService = ordersService;
   }
   
    @GetMapping("/customers")
    public java.util.List<Customers> getAllCustomers() {
        return customersService.getAllCustomers();
    }
   
    @GetMapping("/orders")
    public java.util.List<Orders> getAllOrders(){
        return ordersService.getAllMethods();
    }
    // @PostMapping
    //  public Customers addCustomer(@RequestBody Customers customer) {
    //     return customersService.saveCustomer(customer);
    // }

    
}