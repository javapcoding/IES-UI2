package com.svnikil.api;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSlf4jApplication {
	
	Logger log=org.slf4j.LoggerFactory.getLogger(SpringBootApplication.class);	
	
	
	@GetMapping("/test/{name}")
	public String getString(@PathVariable String name) {
		log.debug("Request {}",name);
		String response="Hi "+name+" this is AvnikhilCodes";
		log.debug("Response {}",response);
		return response;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSlf4jApplication.class, args);
	}

}
