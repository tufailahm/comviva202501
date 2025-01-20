package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController		//details in a short while
public class ComvivavisitorappApplication {

	RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
	
	public static void main(String[] args) {
		SpringApplication.run(ComvivavisitorappApplication.class, args);
		
	}

	@GetMapping("/hello")	//localhost:9090/hello
	public String getResult() {
		return "Generated number is : "+randomNumberGenerator.getRandomNumber();
	}
}
