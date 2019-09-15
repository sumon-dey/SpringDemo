package com.sam.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // -> Explicit Bean ID (spring will automatically
								// register the bean here)
// @Component // -> This is Default Bean Id, that is, tennisCoach
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
