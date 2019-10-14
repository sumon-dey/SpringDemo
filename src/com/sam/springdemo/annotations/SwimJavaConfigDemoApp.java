package com.sam.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		// Coach theCoach = context.getBean("swimCoach", Coach.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());

		// call our new swim coach methods ... has the prop values injected
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());

		// close the context
		context.close();
	}

}
