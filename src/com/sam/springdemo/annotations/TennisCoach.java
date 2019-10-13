package com.sam.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // -> Explicit Bean ID (spring will automatically
								// register the bean here)
// @Component // -> This is Default Bean Id, that is, tennisCoach
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
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
