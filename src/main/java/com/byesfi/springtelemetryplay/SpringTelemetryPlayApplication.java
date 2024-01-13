package com.byesfi.springtelemetryplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/orders")
public class SpringTelemetryPlayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTelemetryPlayApplication.class, args);
	}

	@GetMapping
	public List<Order> getOrders(){
		return List.of(new Order(1L, 33L, ZonedDateTime.now(),  BigDecimal.valueOf(150L)));
	}

	record Order(Long id, Long customerId, ZonedDateTime orderDate, BigDecimal totalAmount){}

}
