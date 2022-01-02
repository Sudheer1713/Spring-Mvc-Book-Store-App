/**
 * 
 */
package com.sudheer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sudheer.bindings.Book;
import com.sudheer.service.BookService;

/**
 * @author Sudheer
 *
 */
@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/loadData")
	public String loadForm(Model model) {

		model.addAttribute("book", new Book());

		return "index";

	}

	@PostMapping("/saveStudent")
	public String saveBook(Book book, Model model) {

		Boolean status = bookService.saveBook(book);
		if (status) {
			model.addAttribute("success", "Book Saved Successfully");
		} else {
			model.addAttribute("failure", "Failed");
		}

		return "index";

	}
	
	@GetMapping("/listOfBooks")
	public String listOfBooks(Model model)
	{
		
		List<Book> books = bookService.lisOfBooks();
		model.addAttribute("listOfBooks", books);
		
		return "data";
	}

}
