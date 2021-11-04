package com.btc.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.btc.app.ui.EmployeeAppUI;

public class EmployeeAppRunner 
{
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		EmployeeAppUI appUI = null;
		appUI = new EmployeeAppUI();
		while (true) {
			System.out.println("Enter a option :\n [1 - Add Employee] \n [2 - Search Employee] \n [3 - Delete Employee] \n [4 - Display all the Employee Details] \n [ 5 - Update Employee] \n [0 - Exit]");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				appUI.addEmployee();
				break;
			case 2:
				appUI.showEmployee();
				break;
			case 3:
				appUI.deleteEmployee();
				break;
			case 4:
				appUI.listOfEmployee();
				break;
			case 5:
				appUI.updateEmployee();
				break;
			case 0:
				System.exit(1);
				break;

			default:
				throw new IllegalArgumentException("Invalid Option: " + option);
			}

			System.out.println("\n");

		}

	}
}
