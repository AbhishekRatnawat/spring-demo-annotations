package com.myspring.springdemo;

public class SadFortuneSevice implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is a sad day!";
	}

}
