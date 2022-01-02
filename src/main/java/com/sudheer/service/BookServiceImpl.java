/**
 * 
 */
package com.sudheer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudheer.bindings.Book;
import com.sudheer.repo.BookRepo;

/**
 * @author Sudheer
 *
 */
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepo bookRepo;

	@Override
	public boolean saveBook(Book book) {
		
		Book save = bookRepo.save(book);
		
		if(save.getBookId() !=null)
		{
			return true;
		}else {
			
			return false;
		}
	}

	@Override
	public List<Book> lisOfBooks() {
		
		return bookRepo.findAll();
	}

}
