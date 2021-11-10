package com.book.app.ui;

import java.sql.SQLException;
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
	

	
	public void searchAuthor()
	{
		System.out.println("Enter Author Details :  ");
		System.out.print("Author ID : ");
		int authorId=sc.nextInt();

		Book book=null;
		try {
			book = bService.searchByAuthor(authorId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(book);
	}



	public void displayFavouriteBooks() 
	{
		System.out.println("The Favourite Books are : ");
		String book=null;
		try {
			book = bService.FavouriteBooks();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(book);
	}
	
	
}
