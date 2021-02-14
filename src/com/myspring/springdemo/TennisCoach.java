package com.myspring.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype") //new instance will be created every time - default scope is singleton

public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis Coach: inside default constructor");
	}
	
	//define init method
	@PostConstruct 
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach inside of doMyStartupStuff()");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach inside of doMyCleanupStuff()");
	}
	
	//define a setter method
	
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> Tennis Coach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	
	@Autowired
	public void doSomeCrazyThings(FortuneService theFortuneService) {
		System.out.println(">> Tennis Coach: inside crazyThings() method");
		this.fortuneService = theFortuneService;
	}*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand Volley";
	}

	@Override
	public String getDailyFotune() {
		
		return fortuneService.getFortune();
	}

}
