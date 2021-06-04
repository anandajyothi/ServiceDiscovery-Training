package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

@RestController
public class FlipkartCustomerController {


	@Autowired
	public IFlipkartOrder  iFlipkart;
	
	@Autowired
	public Environment env;

	@GetMapping("/myorders/{orderId}")
	public Orders getOrderDetails(@PathVariable ("orderId") int orderId ) {
		
		System.out.println("inside customer");
		
		//String port = env.getProperty("local.server.port");
		//iFlipkart.setEnvironment(port);
		
		return iFlipkart.getOrderDetails(orderId);
		//return response.getBody();
		

	}
	

}
