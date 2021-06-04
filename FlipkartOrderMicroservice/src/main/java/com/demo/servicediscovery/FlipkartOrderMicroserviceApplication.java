package com.demo.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class FlipkartOrderMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartOrderMicroserviceApplication.class, args);
	}

	@Bean
	public OrderService getService() {
		
		return new OrderService();
	}
}
