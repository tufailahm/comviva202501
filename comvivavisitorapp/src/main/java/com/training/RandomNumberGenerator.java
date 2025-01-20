package com.training;

public class RandomNumberGenerator {
	public int getRandomNumber() {
		// Generate a random integer between 0 (inclusive) and 99 (inclusive)
		int randomInt = (int) (Math.random() * 100); // cast to int to get an integer value
		return randomInt;
	}
}
