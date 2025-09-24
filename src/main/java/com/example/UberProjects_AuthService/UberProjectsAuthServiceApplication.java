package com.example.UberProjects_AuthService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan("com.example.UberProject_EntityService.models")
public class  UberProjectsAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberProjectsAuthServiceApplication.class, args);
	}

}
