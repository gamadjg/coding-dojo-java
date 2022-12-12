package com.djgama.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djgama.books.models.Book;


@Repository
// CrudReposiroty< Model, identifier type (id) >
public interface BookRepository extends CrudRepository<Book, Long>{
	
//	Find books with descriptions containing the search string
//	List<Book> findByDescriptionContaining(String search);

//	Retrieves all books from the database
	List<Book> findAll();

//	Counts how many titles contain a certain string
//	Long countByTitleContaining(String search);

//	Deletes a book that starts with a specific title
//	Long deleteByTitleStartingWith(String search);
}
