package com.sam.springdemo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of Strings
	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	// Create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		// The below gives a random number based on the array size
		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];

		return theFortune;
	}

}
