/**
 * 
 */
package com.sudheer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudheer.bindings.Book;

/**
 * @author Sudheer
 *
 */
public interface BookRepo extends JpaRepository<Book, Long> {
	
	

}
