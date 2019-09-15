/*Spring Bean Scope Demo*/
package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file and create a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// where, "myCoach" is the bean id and "Coach" is the interface

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same
		boolean result = (theCoach == alphaCoach);

		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory Location for theCoach: " + theCoach);
		System.out.println("\nMemory Location for alphaCoach: " + alphaCoach + "\n");

		// close the context
		context.close();
	}

}
