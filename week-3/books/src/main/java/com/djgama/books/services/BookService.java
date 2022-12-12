package com.djgama.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.djgama.books.models.Book;
import com.djgama.books.repositories.BookRepository;

@Service
public class BookService {
    // Adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // Get one item
    public Book getOne(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		return optionalBook.get();
    	} else {
    		return null;
    	}
    }
    
    // Get all items
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
    
    // Creates one item
    public Book create(Book b) {
        return bookRepository.save(b);
    }
}
