package com.djgama.dojosandninjas.controllers;

import com.djgama.dojosandninjas.models.Ninja;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja) {
		return "createNinja.jsp";
	}

	@PostMapping("/new")
	public String processNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "createNinja.jsp";
		}
		//		create new ninja service
		return "redirect:/ninjas";
	}
}
