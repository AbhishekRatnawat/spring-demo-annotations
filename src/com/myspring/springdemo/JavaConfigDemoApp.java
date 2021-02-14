package com.myspring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read Spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
			
		//get the beans from spring container
		Coach theaCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theaCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theaCoach.getDailyFotune());
		
		//close the context
		context.close();
	}

}
