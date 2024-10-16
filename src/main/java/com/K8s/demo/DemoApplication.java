package com.K8s.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/message")
	public String displayMessage() {

		return "The Application is running Successfully on Docker!!!";
	}	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
