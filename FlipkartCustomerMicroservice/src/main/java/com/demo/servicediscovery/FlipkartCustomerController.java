package com.demo.servicediscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FlipkartCustomerController {

	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/myOrders/{orderId}")
	public Orders getOrderDetails(@PathVariable int orderId ) {
		
		System.out.println("inside customer");
		
		ResponseEntity<Orders> response = restTemplate.exchange("http://FLIPKARTORDERSERVICE/Order/{orderId}", HttpMethod.GET, null,new ParameterizedTypeReference<Orders>() {
		}, new Integer(orderId));
		
		return response.getBody();
		

	}

}
