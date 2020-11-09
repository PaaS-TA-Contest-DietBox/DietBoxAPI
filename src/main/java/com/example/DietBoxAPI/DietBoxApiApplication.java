package com.example.DietBoxAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DietBoxApiApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "DietBoxAPI");
		SpringApplication.run(DietBoxApiApplication.class, args);
	}

}
