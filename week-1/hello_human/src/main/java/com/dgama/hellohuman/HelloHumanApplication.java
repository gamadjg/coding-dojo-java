package com.dgama.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}

	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String firstName, @RequestParam(value = "last_name", required = false) String lastName){
		System.out.println(firstName);
		String fName;
		String lName;
		if(firstName == null){
			fName= "Human";
		} else{
			fName = firstName;
		}
		if(lastName == null){
			lName= "";
		} else{
			lName = lastName;
		}
		return "Hello "+fName+" "+lName;
	}
}
