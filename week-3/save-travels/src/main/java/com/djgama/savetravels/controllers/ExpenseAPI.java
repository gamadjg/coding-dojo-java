package com.djgama.savetravels.controllers;
import com.djgama.savetravels.services.ExpenseService;
import org.springframework.web.bind.annotation.*;

import com.djgama.savetravels.models.Expense;
import java.util.List;

@RestController
public class ExpenseAPI {
	private final ExpenseService expenseService;
	public ExpenseAPI(ExpenseService expenseService){
		this.expenseService = expenseService;
	}

	// Get all
	@GetMapping("/api/expenses")
	public List<Expense> index() {
		return expenseService.getAll();
	}

	// Get one
	@GetMapping("/api/expenses/{id}")
	public Expense show(@PathVariable("id") Long id) {
		return expenseService.getOne(id);
	}

	// Create one
	@PostMapping("/api/expenses")
	public Expense create(
			@RequestParam("name") String name,
			@RequestParam("vendor") String vendor,
			@RequestParam("amount") Integer amount
	) {
		Expense expense = new Expense(name, vendor, amount);
		return expenseService.create(expense);
	}

	// Update one
	@PutMapping("/api/expenses/{id}")
	public Expense update(
			@PathVariable("id") Long id,
			@RequestParam("name") String name,
			@RequestParam("vendor") String vendor,
			@RequestParam("amount") Integer amount
	){
		Expense expense = new Expense(id, name, vendor, amount);
		return expenseService.update(expense);
	}

	// Delete one
	@DeleteMapping("/api/expenses/{id}")
	public void delete(@PathVariable("id") Long id) {
		expenseService.delete(id);
	}

}
