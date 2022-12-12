package com.djgama.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.djgama.books.models.Book;
import com.djgama.books.services.BookService;



@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    
    // Get all
    @GetMapping("/api/books")
    public List<Book> index() {
    	return bookService.getAll();
    }
    
    // Get one
    @GetMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
    	return bookService.getOne(id);
    }
    
    // Create one
    @PostMapping("/api/books")
    public Book create(
    		@RequestParam("title") String title,
    		@RequestParam("description") String description,
    		@RequestParam("language") String lang,
    		@RequestParam("pages") Integer pages
    		) {
        Book book = new Book(title, description, lang, pages);
        return bookService.create(book);
    }
    
    // Update one
    @PutMapping("/api/books/{id}")
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam("title") String title, 
    		@RequestParam("description") String desc, 
    		@RequestParam("language") String lang,
    		@RequestParam("pages") Integer numOfPages) {
        Book book = bookService.update(id, title, desc, lang, numOfPages);
        return book;
    }
    
    // Delete one
    @DeleteMapping("/api/books/{id}")
    public void delete(@PathVariable("id") Long id) {
        bookService.delete(id);
    }
    
}

