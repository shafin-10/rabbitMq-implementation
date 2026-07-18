package com.example.springboot_rabbitmq_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRabbitmqProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqProjectApplication.class, args);
		System.out.println("----------------------" +
				"application started" +
				"------------------------------"
		);
	}

}
