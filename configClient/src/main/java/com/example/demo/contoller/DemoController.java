package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {
	
	
	@Value("${developer.name}")
	public String developerName;
	
	@GetMapping("/developer")
	public String getUser() {
		
		return  developerName;
	}

}
