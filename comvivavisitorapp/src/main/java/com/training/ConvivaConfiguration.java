package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConvivaConfiguration {

	@Bean
	public Quote quote1() {
		return new Quote();
	}

	@Bean(name = "comvivaquote")
	public Quote quote2() {
		return new Quote("Honesty is the best policy");
	}
	
	@Bean(name = "comvivahello")
	public Quote comvivahello() {
		return new Quote("Honesty is not the best policy");
	}
	@Bean
	public RandomNumberGenerator generator()
	{
		return new RandomNumberGenerator();
	}
}
