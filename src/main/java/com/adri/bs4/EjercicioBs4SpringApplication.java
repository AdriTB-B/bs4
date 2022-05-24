package com.adri.bs4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.yml")
public class EjercicioBs4SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioBs4SpringApplication.class, args);
	}

}
