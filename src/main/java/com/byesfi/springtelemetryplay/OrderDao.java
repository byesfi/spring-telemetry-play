package com.byesfi.springtelemetryplay;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao {

    private final OrderRepository orderRepository;

    public OrderDao(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

}
