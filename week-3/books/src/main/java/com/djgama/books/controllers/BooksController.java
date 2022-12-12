package com.djgama.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.djgama.books.services.BookService;

@Controller
@RequestMapping("/books")
public class BooksController {
    private final BookService bookService;
    
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }
    
    // Show all
	@GetMapping("/all")
	public String index(Model model) {
		model.addAttribute("books", bookService.getAll());
		return "index.jsp";
	}

	// Show one
	@GetMapping("/{id}")
	public String book(Model model, @PathVariable("id") Long id) {
		model.addAttribute("book", bookService.getOne(id));
		return "book.jsp";
	}
	
	
	
}
