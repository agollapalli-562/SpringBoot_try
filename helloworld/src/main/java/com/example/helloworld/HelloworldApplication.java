package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloworldApplication.class, args);
	}
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World from Spring Boot Application!";
	}
	// Third commit also!!
	// Trying to create multiple commit id's


}
