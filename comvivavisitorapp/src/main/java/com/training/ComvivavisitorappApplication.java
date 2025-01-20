package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController		//details in a short while
public class ComvivavisitorappApplication {
	
	//normal way
	//RandomNumberGenerator randomNumberGenerator = 
		//	new RandomNumberGenerator();
	
	@Autowired(required = false)
	RandomNumberGenerator randomNumberGenerator;
	
	@Autowired()
	@Qualifier("comvivahello")
	Quote q;
	
	public static void main(String[] args) {
		SpringApplication.run(ComvivavisitorappApplication.class, args);
	}

	@GetMapping("/hello")	//http://localhost:9090/hello
	public String getResult() {
		return "Generated number is : "+randomNumberGenerator.getRandomNumber();
	}
	
	
	@GetMapping({"/abc","xyz"})
	public String getQuote() {
		return q.getQuote();
	}
}

