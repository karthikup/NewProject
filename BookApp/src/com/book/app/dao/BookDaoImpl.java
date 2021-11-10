package com.book.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.book.app.model.Book;



public class BookDaoImpl implements BookDao 
{
	private Connection con;
	
	private PreparedStatement smt;
	
	public BookDaoImpl() throws SQLException
	{
		con=ConnectionUtil.getDbConnection();
	}
	
	@Override
	public Book searchByAuthor(int authorId) throws SQLException 
	{
//		int bookId=0;
		String query = "select * from Book where author_id = ?";
		smt=con.prepareStatement(query);
		
		smt.setInt(1, authorId);	
		
		ResultSet queryResult = smt.executeQuery();
		
		Book b=null;
		while(queryResult.next())
		{
			b = new Book();
			b.setAuthorId(authorId);
			b.setAuthorName(queryResult.getString("author_name"));
			b.setBookId(queryResult.getInt("book_id"));
			b.setBookName(queryResult.getString("book_name"));
			System.out.println(b);
		}
		return null;
	}

	@Override
	public String FavouriteBooks() throws Exception {
		String foundType="";
		String query = "select distinct favourite_books from Book";
		//String query = "select favourite_books, from Book where classid=? and absentdt>=? and absentdt<=";
		smt=con.prepareStatement(query);
		ResultSet queryResult = smt.executeQuery();
		while(queryResult.next())
		{
			String res =queryResult.getString("favourite_books");
			System.out.println(res);
		}
		return null;
//		int i=1;
//		if(queryResult.next())
//		{
//			   foundType = queryResult.getString(i);
//			   i++;
//			   return foundType;
//		}
//		return null;
	}

	@Override
	public Book recomandedService() {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
}
