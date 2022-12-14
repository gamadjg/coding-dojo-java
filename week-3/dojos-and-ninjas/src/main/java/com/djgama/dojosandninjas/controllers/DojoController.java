package com.djgama.dojosandninjas.controllers;

import com.djgama.dojosandninjas.models.Dojo;
import com.djgama.dojosandninjas.services.DojoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	private final DojoService dojoService;
	public DojoController(DojoService dojoService){
		this.dojoService = dojoService;
	}

	@GetMapping("")
	public String getAllDojos(Model model){
		model.addAttribute("dojos", dojoService.getAll());
		return "index.jsp";
	}

	@GetMapping("/{id}")
	public String getOneDojo(@PathVariable("id") Long id, Model model){
		// get one dojo, save as model attribute, else null
		model.addAttribute("dojo", dojoService.getOne(id));
		return "showDojo.jsp";
	}

	@GetMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo){
		return "createDojo.jsp";
	}

	@PostMapping("/new")
	public String processNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
		if(result.hasErrors()){
			return "createDojo.jsp";
		}
//		create new dojo service
		dojoService.create(dojo);
		return "redirect:/dojos";
	}
}
