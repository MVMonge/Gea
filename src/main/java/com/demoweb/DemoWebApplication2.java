package com.demoweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWebApplication2 {

	private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication2.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication2.class, args);
		LOG.info("Starting Gea Web Application");
	}
	
}


