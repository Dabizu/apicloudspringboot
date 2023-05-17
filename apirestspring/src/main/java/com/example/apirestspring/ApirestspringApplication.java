package com.example.apirestspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApirestspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestspringApplication.class, args);
	}

}
