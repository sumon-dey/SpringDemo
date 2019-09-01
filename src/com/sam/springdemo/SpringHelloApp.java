package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the spring configuration file and create a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from the spring container
		Coach theBaseballCoach = context.getBean("myBaseballCoach", Coach.class);
		// where, "myCoach" is the bean id and "Coach" is the interface

		// call methods on the bean
		System.out.println(theBaseballCoach.getDailyWorkout());
		System.out.println(theBaseballCoach.getDailyFortune());

		System.out.println("***************************************************************");

		// retrieve bean from the spring container
		Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
		// where, "myCoach" is the bean id and "Coach" is the interface

		// call methods on the bean
		System.out.println(theTrackCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyFortune());

		System.out.println("***************************************************************");

		// close the application context
		context.close();
	}

}
