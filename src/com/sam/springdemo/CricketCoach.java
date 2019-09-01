package com.sam.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	// create a non-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
		System.out.println("***************************************************************");
	}

	// create a setter method for the FortuneService
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		System.out.println("***************************************************************");
		this.fortuneService = fortuneService;
	}

	// create a setter method for the emailaddress
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method - setEmailAddress");
		System.out.println("***************************************************************");
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	// create a setter method for the team
	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method - setTeam");
		System.out.println("***************************************************************");
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
