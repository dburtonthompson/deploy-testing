package com.example.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployApplication {

	@GetMapping
	public String sayHello() {
		return "Hello world";
	}
}
