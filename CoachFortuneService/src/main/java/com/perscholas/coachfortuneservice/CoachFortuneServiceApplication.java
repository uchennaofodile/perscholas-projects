package com.perscholas.coachfortuneservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.perscholas.coachfortuneservice.myservices.Coach;

@SpringBootApplication
public class CoachFortuneServiceApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context =  SpringApplication.run(CoachFortuneServiceApplication.class, args);
		  // get the bean from spring container
	     Coach theCoach = context.getBean(Coach.class);

	     // call a method on the bean
	     System.out.println(theCoach.getDailyWorkout());

	     // call method to get daily fortune
	     System.out.println(theCoach.getDailyFortune());

	     // close the context
	     context.close();

	
	}

}
