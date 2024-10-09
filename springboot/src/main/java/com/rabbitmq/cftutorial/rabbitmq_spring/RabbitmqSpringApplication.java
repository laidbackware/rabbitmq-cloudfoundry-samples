package com.rabbitmq.cftutorial.rabbitmq_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.rabbitmq.cftutorial.rabbitmq_spring")
public class RabbitmqSpringApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RabbitmqSpringApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqSpringApplication.class, args);
	}
}