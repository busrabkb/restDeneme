package com.restDeneme.restDeneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class RestDenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDenemeApplication.class, args);
	}

}
