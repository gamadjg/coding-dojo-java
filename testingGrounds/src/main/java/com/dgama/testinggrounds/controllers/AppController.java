package com.dgama.testinggrounds.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
