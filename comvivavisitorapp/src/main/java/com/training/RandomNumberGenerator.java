package com.training;

import org.springframework.stereotype.Component;

//@Component		//
public class RandomNumberGenerator {
	public int getRandomNumber() {
		// Generate a random integer between 0 (inclusive) and 99 (inclusive)
		int randomInt = (int) (Math.random() * 100); // cast to int to get an integer value
		return randomInt;
	}
}
