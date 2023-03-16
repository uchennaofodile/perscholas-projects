package com.perscholas.modelandview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.perscholas.modelandview.controller"})
public class ModelAndViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelAndViewApplication.class, args);
	}

}
