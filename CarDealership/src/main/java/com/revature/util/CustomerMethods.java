package com.revature.util;

import java.sql.SQLException;
import java.util.Scanner;


import com.revature.daoimpl.CarDaoImpl;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.users.Customer;

public class CustomerMethods {
	public static CustomerDaoImpl cdi = new CustomerDaoImpl();
	static Scanner data = new Scanner(System.in);
	static int customerId;
	static String customerName;
	static String customerPassword;
	static int var;
public static void insertCustomer () {
	
		/*System.out.println("1) To create a new user");
		System.out.println("2) Already a user?");
		var = data.nextInt();
		
		switch(var) {
		case 1:*/
			System.out.println("Insert User Name: ");
			customerName = data.nextLine();
			
			System.out.println("Insert User Last name: ");
			customerPassword = data.nextLine();
		
			System.out.println("User has been created");
			
			try {
				cdi.createCustomer(customerId, customerName, customerPassword);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//customer info
			try {
				System.out.println(cdi.getCustomer(customerId, customerName, customerName));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Customer.customerMenu();
		/*break;
		
		case 2:
			System.out.println("Insert user ID");
			customerId= data.nextInt();
			//customer info
			try {
				System.out.println(cdi.getCustomer());
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Customer.customerMenu();
		break;
		}*/
		

		
		
		
		
	}

}
