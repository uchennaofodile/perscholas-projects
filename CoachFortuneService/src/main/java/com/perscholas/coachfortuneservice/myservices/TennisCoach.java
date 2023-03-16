package com.perscholas.coachfortuneservice.myservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class TennisCoach implements Coach {
	 @Autowired
	  @Qualifier("databaseFortuneService")
  private FortuneServices fortuneService;

  // Put here for 1st example @Autowired
  public TennisCoach(FortuneServices theFortuneService) {
     fortuneService = theFortuneService;
  }
  @Override
  public String getDailyWorkout() {
     return "Practice your backhand volley";
  }
  @Override
  public String getDailyFortune() {
     return fortuneService.getFortune();
  }
}

