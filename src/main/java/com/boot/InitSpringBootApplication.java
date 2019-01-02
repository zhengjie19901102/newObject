package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("----OK----");
		SpringApplication.run(InitSpringBootApplication.class, args);
	}

}

