package com.dgama.daikichipathvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}

	@RequestMapping("/")
	public String landing(){
		return "Hello World!";
	}
	@RequestMapping("/daikichi")
	public String welcome(){
		return "Welcome!";
	}
	@RequestMapping("/daikichi/today")
	public String today(){
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow(){
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

	@RequestMapping("/daikichi/travel/{location}")
	public String travel(@PathVariable("location") String location){
		return "Time to start travelling again! First place we're going to is " + location + "!";
	}

	@RequestMapping("/daikichi/lotto/{lottoNum}")
	public String lottery(@PathVariable(value = "lottoNum", required = false) Integer lottoNum){
		if(lottoNum %2 == 0){
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else{
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
