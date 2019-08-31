package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the spring configuration file and create a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// where, "myCoach" is the bean id and "Coach" is the interface

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the application context
		context.close();
	}

}
