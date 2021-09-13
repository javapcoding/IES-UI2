package com.usa.ri.gov.ies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.usa")
public class IesApplication {

	public static void main(String[] args) {
		SpringApplication.run(IesApplication.class, args);
	}

}
