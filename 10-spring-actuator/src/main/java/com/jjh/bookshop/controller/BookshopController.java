package com.jjh.bookshop.controller;

import com.jjh.bookshop.domain.Book;
import com.jjh.bookshop.domain.BookNotFoundException;
import com.jjh.bookshop.service.BookshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookshop")
public class BookshopController {
	
	@Autowired
    private BookshopService bookshop;
	
	@GetMapping("{isbn}")
	public Book getBook(@PathVariable String isbn) {
		System.out.println("BookshopController.getBook(" + isbn + ")");
		return this.bookshop.getBook(isbn);
	}
	
	@GetMapping("list")
	public List<Book> getAllBooks() {
		System.out.println("BookshopController.getAllBooks()");
		return bookshop.getAllBooks();
	}

	// @PostMapping(consumes = "application/json", produces = "application/json")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void addBook(@RequestBody Book book) {
		System.out.println("BookshopController.addBook(" + book + ")");
		this.bookshop.addBook(book);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public void updateBook(@RequestBody Book book) {
		System.out.println("BookshopController.updateBook(" + book + ")");
		this.bookshop.updateBook(book);
	}
	
	@DeleteMapping("{isbn}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteBook(@PathVariable(required = true) String isbn) {
		System.out.println("BookshopController.deleteBook(" + isbn + ")");
		bookshop.deleteBook(isbn);
	}
	
	@ExceptionHandler(BookNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Book not found")
	public void updateFailure() { }
	

}
