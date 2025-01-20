package com.training;

import org.springframework.stereotype.Component;

@Component	//quote
public class Quote {
	
	String message;
	
	public Quote() {
		System.out.println("####quote def cons called");
		this.message = "Either you run the day or the day runs you";
	}
	
	public Quote(String message) {
		super();
		this.message = message;
	}

	public String getQuote() {
		return message;
	}
}
