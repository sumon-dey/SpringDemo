package com.sam.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // -> Explicit Bean ID (spring will automatically
								// register the bean here)
// @Component // -> This is Default Bean Id, that is, tennisCoach
@Scope("singleton")
// @Scope("prototype") // By default, scope is "singleton"
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
	}

	// define my init method
	// Code will execute after constructor and after injection of dependencies
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: Inside of doMyStartupStuff() method");
	}

	// define my destroy method
	// Code will execute before bean is destroyed
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: Inside of doMyCleanupStuff() method");
	}

	// define a setter method for injection
	/*
	 * @Autowired public void setFortuneService(FortuneService
	 * theFortuneService) {
	 * System.out.println(">> TennisCoach: Inside setFortuneService() method");
	 * fortuneService = theFortuneService; }
	 */

	// define any method for injection
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService)
	 * { System.out.println(">> TennisCoach: Inside doSomeCrazyStuff() method");
	 * fortuneService = theFortuneService; }
	 */

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
