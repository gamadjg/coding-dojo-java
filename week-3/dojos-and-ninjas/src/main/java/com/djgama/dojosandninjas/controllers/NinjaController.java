package com.djgama.dojosandninjas.controllers;

import com.djgama.dojosandninjas.models.Dojo;
import com.djgama.dojosandninjas.models.Ninja;
import com.djgama.dojosandninjas.services.DojoService;
import com.djgama.dojosandninjas.services.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	public NinjaController(NinjaService ninjaService, DojoService dojoService){
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}

	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAll());
		return "createNinja.jsp";
	}

	@PostMapping("/new")
	public String processNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", dojoService.getAll());
			return "createNinja.jsp";
		}
		//		create new ninja service
		ninjaService.create(ninja);
		return "redirect:/dojos";
	}
}
