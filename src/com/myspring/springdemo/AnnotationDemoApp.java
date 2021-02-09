package com.myspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		//get the beans from spring container
		Coach theaCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theaCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
