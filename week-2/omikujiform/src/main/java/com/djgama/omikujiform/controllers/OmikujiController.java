package com.djgama.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String form() {
		return "form.jsp";
	}
	
	@PostMapping("/processResults")
	public String processResults(
			@RequestParam("theNum") int theNum,
			@RequestParam("cityName") String cityName ,
			@RequestParam("personName") String personName,
			@RequestParam("hobby") String hobby,
			@RequestParam("objectName") String objectName,
			@RequestParam("somethingNice") String somethingNice,
			HttpSession session) {
		session.setAttribute("theNum", theNum);
		session.setAttribute("cityName", cityName);
		session.setAttribute("personName", personName);
		session.setAttribute("hobby", hobby);
		session.setAttribute("objectName", objectName);
		session.setAttribute("somethingNice", somethingNice);
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String results() {
		return "results.jsp";
	}
	
	
}
