package com.book.app.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.book.app.ui.BookAppUi;

public class BookAppRunner {

	public static void main(String[] args) throws SQLException 
	{
		Scanner sc = new Scanner(System.in);
		BookAppUi appUi=null;
		appUi = new BookAppUi();
		while(true)
		{
			System.out.println("Enter a option : \n [1 - Display Favourite Books] \n [2 - Search By Authors] \n [3 -Display Recomandation] \n [0 - Exit] \n" );
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
					appUi.displayFavouriteBooks();
					break;
				case 2:
					appUi.searchAuthor();
					break;
				case 0:
					System.exit(1);
					break;
				default:
					throw new IllegalArgumentException("Invalid Option: " + option);
			}
		}
	}

}
