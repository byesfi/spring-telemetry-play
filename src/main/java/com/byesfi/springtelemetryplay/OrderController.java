package com.byesfi.springtelemetryplay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);
    private final OrderDao orderDao;

    public OrderController(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @GetMapping
    public List<Order> getOrders(){
        log.info("#### Hello from getOrders Controller endpoint");
        return orderDao.getAllOrders();
    }
    @GetMapping("{orderId}")
    public Order getOrderById(@PathVariable("orderId") Long orderId){
        log.warn("#### OrderId is " + orderId.toString());
        return orderDao.getOrderById(orderId);
    }

    @GetMapping("/error")
    public List<Order> getError() throws IllegalAccessException {
        throw new IllegalAccessException("orderId not found");
    }

    @ExceptionHandler(IllegalAccessException.class)
    public ProblemDetail exceptionHandler(IllegalAccessException exception){
        log.error("#### Bad request");
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, exception.getMessage());
    }
}
