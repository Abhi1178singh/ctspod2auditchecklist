package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan("com")
public class AuditChecklistApplication {
	
	/*
	 * Main method to launch Audit Checklist microservice
	 */

	public static void main(String[] args) {
		SpringApplication.run(AuditChecklistApplication.class, args);
	}

}
