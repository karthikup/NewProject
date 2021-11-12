package com.book.app.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.book.app.model.Book;
import com.book.app.service.BookService;
import com.book.app.service.BookServiceImpl;


public class BookAppUi 
{
	private Scanner sc = new Scanner(System.in);
	private static BookService bService;
	
	public BookAppUi() throws SQLException
	{
		bService = new BookServiceImpl();
	}
	

	
	public void searchAuthor() throws AuthorNotFoundException
	{
		System.out.println("Enter Author Details :  ");
		System.out.print("Author ID : ");
		int authorId=0;
		List<Book> book=null;
		try
		{
			authorId=sc.nextInt();
			if(authorId>1000)
			{
				throw new InvalidAuthorIdException("Enter the auhtorId less than 1000 : "+authorId);
			}
		}
		catch(AuthorNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Handeled AuthorNotFoundException");
			System.out.println("Invalid AuhtorId");	
		}
		catch(InvalidAuthorIdException e2)
		{
			System.out.println(e2.getMessage());
			System.out.println("Handeled InvalidAuthorIdException");
		}
		try 
		{
			book = bService.searchByAuthor(authorId);
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}

		System.out.println(book);
	}



	public void displayFavouriteBooks() 
	{
		System.out.println("The Favourite Books are : ");
		List<String> book=null;
		try {
			book = bService.FavouriteBooks();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(book);
	}
	
	public void displayRecomanded()
	{
		System.out.println("The Recomanded Books are : ");
		List<String> book=null;
		try {
			book = bService.recomandedService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(book);
	}
}
