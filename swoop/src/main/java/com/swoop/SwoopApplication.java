package com.swoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwoopApplication.class, args);
		
		System.out.println("Hello Swoop Good Day.");
	}

}
