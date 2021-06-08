package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurity {

	@GetMapping("/secure/users")
	public String getUser() {
		
		return "You are authenticated";
	}
}
