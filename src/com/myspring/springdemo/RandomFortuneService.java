package com.myspring.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
		"Beware of mad dogs",
		"Lucky Day",
		"sell some property",
		"invest in bullish stocks"
		
	};
	
	//create some random number generator
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		
		//pick random fortune from the array
		int index = myRandom.nextInt(data.length);
		System.out.println(index);
		String theFortuneString = data[index];
		return theFortuneString;
	}

}
