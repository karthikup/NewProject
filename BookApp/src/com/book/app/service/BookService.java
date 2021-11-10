package com.book.app.service;

import com.book.app.model.Book;

public interface BookService 
{
	public String FavouriteBooks() throws Exception;
	public Book searchByAuthor(int auhtorId) throws Exception;
	public Book recomandedService();
}
