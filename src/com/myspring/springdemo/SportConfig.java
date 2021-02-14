package com.myspring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.myspring.springdemo")
public class SportConfig {

	
	//define bean for sad fortune service
	
	@Bean
	public FortuneService sadFortuneService() {
		
		return new SadFortuneSevice();
	}
	
	//define bean for our swim coach and inject dependency
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
