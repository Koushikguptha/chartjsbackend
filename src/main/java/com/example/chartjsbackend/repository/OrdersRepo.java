package com.example.chartjsbackend.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chartjsbackend.model.Orders;
@Repository
public interface OrdersRepo  extends JpaRepository<Orders,Long>{
//List<Orders> findAll();
    
}
