package com.revature.users;

import java.util.Scanner;

import com.revature.util.CustomerMethods;

public class LogInCustomer {
	
	public void LogInMethod() {
		
		System.out.println("WELCOME TO THE CUSTOMER PORTAL");
		System.out.println("-------------------------------");
		Scanner sc = new Scanner(System.in);
		String user;
		String pass;
		
		CustomerMethods.insertCustomer();
		/*boolean conditionCheck;
		do {
			
			System.out.print("Enter user name: ");
			user = sc.nextLine();
			System.out.println("-------------------------------");
			
			
			System.out.print("Enter password: ");
			pass = sc.nextLine();
			System.out.println("-------------------------------");
			
			
			if(user.equals("user") && pass.equals("user")) {
				conditionCheck = true;
				System.out.println("Succesful Loggin");
				Customer.customerMenu();
			}else {
				conditionCheck = false;
				System.out.println("Incorrect user name or password please try again");
				System.out.println("-------------------------------------------------");
				
			}
		
		}while(conditionCheck == false);*/
		
	}
}
