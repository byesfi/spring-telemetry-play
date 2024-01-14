package com.byesfi.springtelemetryplay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderDao orderDao;

    public OrderController(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderDao.getAllOrders();
    }
}
