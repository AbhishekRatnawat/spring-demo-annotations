package com.myspring.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicit bean id
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand Volley";
	}

}
