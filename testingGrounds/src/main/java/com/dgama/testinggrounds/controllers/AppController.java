package com.dgama.testinggrounds.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class AppController {
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("dojoName", "test");
		return "index.jsp";
	}
}
