package com.book.app.dao;

import com.book.app.model.Book;

public interface BookDao 
{
	public String FavouriteBooks() throws Exception;
	public Book searchByAuthor(int auhtorId) throws Exception;
	public String recomandedService() throws Exception;
}
