package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value="FLIPKARTORDERSERVICE" , url="localhost:8686")
public interface IFlipkartOrder {

	@GetMapping("/Order/{orderId}")
	public Orders getOrderDetails(@PathVariable ("orderId") int orderId);
	
	
}
