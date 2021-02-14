package com.myspring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicit bean id
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand Volley";
	}

	@Override
	public String getDailyFotune() {
		
		return fortuneService.getFortune();
	}

}
