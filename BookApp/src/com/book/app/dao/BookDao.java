package com.book.app.dao;

import java.util.List;

import com.book.app.model.Book;

public interface BookDao 
{
	public List<String> FavouriteBooks() throws Exception;
	public List<Book> searchByAuthor(int auhtorId) throws Exception;
	public List<String> recomandedService() throws Exception;

	
}
