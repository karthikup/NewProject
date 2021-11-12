package com.book.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.book.app.model.Book;

class BookDaoImplTest {

	//Book b = new Book(1000,"Mahabharath",10,"Vyasa");
	//BookDao book = new BookDaoImpl();
	@Test
	void searchByAuthorId() {
//		fail("Not yet implemented");
		Book b = new Book(1000,"Mahabharath",10,"Vyasa");
		assertEquals(b,10);
	}

}
