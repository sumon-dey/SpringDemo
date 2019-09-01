package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file and create a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from the spring container
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// where, "myCoach" is the bean id and "Coach" is the interface

		// call methods on the bean
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());

		// call methods to get the literal values
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());

		// close the application context
		context.close();
	}

}
