/**
 * 
 */
package com.sudheer.service;

import java.util.List;

import com.sudheer.bindings.Book;

/**
 * @author Sudheer
 *
 */
public interface BookService {
	
	public boolean saveBook(Book book);
	
	public List<Book> lisOfBooks();

}
