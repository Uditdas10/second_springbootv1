package com.udit.second_springboot.second_springbootv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondSpringbootv1Application {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringbootv1Application.class, args);
		System.out.println("Spring boot app Started....");
		System.out.println("Book Service is up...");
		System.out.println("Application ready to serve......");
	}

}
