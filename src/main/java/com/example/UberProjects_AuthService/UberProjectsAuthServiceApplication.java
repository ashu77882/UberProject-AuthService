package com.example.UberProjects_AuthService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UberProjectsAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberProjectsAuthServiceApplication.class, args);
	}

}
