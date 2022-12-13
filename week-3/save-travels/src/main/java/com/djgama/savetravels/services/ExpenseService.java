package com.djgama.savetravels.services;
import java.util.List;
import java.util.Optional;
import com.djgama.savetravels.models.Expense;
import org.springframework.stereotype.Service;
import com.djgama.savetravels.repositories.ExpenseRepository;


@Service
public class ExpenseService {
    // Adding the book repository as a dependency
    private final ExpenseRepository expenseRepository;
    
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    
    // Get one item
    public Expense getOne(Long id) {
    	Optional<Expense> optionalExpense = expenseRepository.findById(id);
	    return optionalExpense.orElse(null);
//    	if(optionalExpense.isPresent()) {
//    		return optionalExpense.get();
//    	} else {
//    		return null;
//    	}
    }
    
    // Get all items
    public List<Expense> getAll() {
        return expenseRepository.findAll();
    }
    
    // Create one item
    public Expense create(Expense expense) {
        return expenseRepository.save(expense);
    }
    
    // Update item by id
//    public Book update(Long id, String title, String description, String language, Integer numberOfPages) {
//    	Book bookToUpdate = new Book(id, title, description, language, numberOfPages);
//    	return expenseRepository.save(bookToUpdate);
//    }
    public Expense update(Expense expense){
	    return expenseRepository.save(expense);
    }

    // Delete item by id
    public void delete(Long id) {
    	expenseRepository.deleteById(id);
    }
    
    
}
