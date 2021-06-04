package com.demo.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlipkartServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartServiceDiscoveryApplication.class, args);
	}

}
