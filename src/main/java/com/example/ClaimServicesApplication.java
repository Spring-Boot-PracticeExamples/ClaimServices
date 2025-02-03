package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "generated.main"})
@EnableJpaRepositories(basePackages = "com.example")
public class ClaimServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClaimServicesApplication.class, args);
	}
}
