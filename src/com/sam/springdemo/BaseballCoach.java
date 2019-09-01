package com.sam.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field for the Dependency Injection
	private FortuneService fortuneService;

	// Create a constructor for the Dependency Injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
