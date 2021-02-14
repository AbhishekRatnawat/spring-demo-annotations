package com.myspring.springdemo;


public class SwimCoach implements Coach{

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1km daily for warm up!";
	}

	@Override
	public String getDailyFotune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
