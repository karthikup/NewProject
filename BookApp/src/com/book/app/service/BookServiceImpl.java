package com.book.app.service;

import java.sql.SQLException;

import com.book.app.dao.BookDao;
import com.book.app.dao.BookDaoImpl;
import com.book.app.model.Book;

public class BookServiceImpl implements BookService{
	
	
	BookDao bookService;
	
	public BookServiceImpl() throws SQLException
	{
		bookService = new BookDaoImpl();
	}
	
	@Override
	public Book searchByAuthor(int auhtorId) throws Exception {
		return bookService.searchByAuthor(auhtorId);
		
	}

	

	@Override
	public Book recomandedService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String FavouriteBooks() throws Exception {
		
		return bookService.FavouriteBooks();
	}

	

	

}
