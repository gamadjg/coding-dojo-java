package com.djgama.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djgama.savetravels.models.Expense;
@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	
//	Find books with descriptions containing the search string
//	List<Book> findByDescriptionContaining(String search);

//	Retrieves all books from the database
	List<Expense> findAll();

//	Counts how many titles contain a certain string
//	Long countByTitleContaining(String search);

//	Deletes a book that starts with a specific title
//	Long deleteByTitleStartingWith(String search);
}
