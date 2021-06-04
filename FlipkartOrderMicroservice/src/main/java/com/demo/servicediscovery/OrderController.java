package com.demo.servicediscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	public OrderService orderService;

	@GetMapping("/Order/{orderId}")
	public Orders getOrderDetails(@PathVariable int orderId) {
		Orders orders = orderService.getOrderDetails(orderId);
		return orders;

	}

}
