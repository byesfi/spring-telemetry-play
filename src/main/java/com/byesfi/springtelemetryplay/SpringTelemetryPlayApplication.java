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
public class SpringTelemetryPlayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTelemetryPlayApplication.class, args);
	}
}
