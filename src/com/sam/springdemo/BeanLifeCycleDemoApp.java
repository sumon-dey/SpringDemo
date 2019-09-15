/*Spring Bean Scope Demo*/
package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file and create a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// where, "myCoach" is the bean id and "Coach" is the interface

		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
