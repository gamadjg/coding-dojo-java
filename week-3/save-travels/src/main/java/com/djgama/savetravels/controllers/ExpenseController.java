package com.djgama.savetravels.controllers;

import com.djgama.savetravels.models.Expense;
import com.djgama.savetravels.services.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
	private final ExpenseService expenseService;
	public ExpenseController(ExpenseService expenseService){
		this.expenseService = expenseService;
	}

	// Show all
	@GetMapping("")
	public String index(Model model, @ModelAttribute("expense") Expense expense) {
		model.addAttribute("allExpenses", expenseService.getAll());
		return "index.jsp";
	}

	// Show one
	@GetMapping("show/{id}")
	public String expense(Model model, @PathVariable("id") Long id) {
		model.addAttribute("expense", expenseService.getOne(id));
		return "showExpense.jsp";
	}

//	// Create one show
//	@GetMapping("/new")
//	public String newExpense(@ModelAttribute("expense") Expense expense){
//		return "newExpense.jsp";
//	}

	// Create one process
	@PostMapping("/new")
	public String processNewExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result){
		if(result.hasErrors()){
			return "/index.jsp";
		}
		expenseService.create(expense);
		return "redirect:/expenses";
	}

	// Edit one show
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id") Long id, Model model){
		model.addAttribute("expense", expenseService.getOne(id));
		return "editExpense.jsp";
	}

	// Edit one process
	@PostMapping("/edit/{id}")
	public String processEditExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result){
		if(result.hasErrors()){
			return "editExpense.jsp";
		}
		System.out.println(expense.getId());
		expenseService.update(expense);
		return "redirect:/expenses";
	}

	// Delete one
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}
}
