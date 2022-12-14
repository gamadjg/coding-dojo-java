package com.djgama.dojosandninjas.controllers;

import com.djgama.dojosandninjas.models.Dojo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/dojos")
public class DojoController {

	@GetMapping("")
	public String getAllDojos(){
		// get all dojos
		return "index.jsp";
	}

	@GetMapping("/{id}")
	public String getOneDojo(@PathVariable("id") Long id, Model model){
		// get one dojo, save as model attribute
		return null;
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
		return "redirect:/dojos";
	}
}
