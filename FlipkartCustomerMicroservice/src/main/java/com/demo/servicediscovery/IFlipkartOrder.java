package com.demo.servicediscovery;

import org.springframework.web.bind.annotation.GetMapping;



public interface IFlipkartOrder {

	@GetMapping("/myOrders/{orderId}")
	public Orders getOrderDetails(int orderId);
	
	
}
