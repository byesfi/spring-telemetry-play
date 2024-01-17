package com.byesfi.springtelemetryplay;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.ZonedDateTime;


@Entity
@Table(name="orders")
public class Order {
    @Id
    Long id;
    Long customerId;
    ZonedDateTime orderDate;
    BigDecimal totalAmount;

    public Order() {
    }

    public Order(Long id, Long customerId, ZonedDateTime orderDate, BigDecimal totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
}
