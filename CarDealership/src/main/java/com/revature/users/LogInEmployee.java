package com.revature.users;

import java.util.Scanner;

public class LogInEmployee {
	
	public void LogInMethod() {
	
		System.out.println("WELCOME TO THE EMPLOYEE PORTAL");
		System.out.println("-------------------------------");
		Scanner sc = new Scanner(System.in);
		String user;
		String pass;
		boolean conditionCheck;
		do {
			
			System.out.print("Enter user name: ");
			user = sc.nextLine();
			System.out.println("-------------------------------");
			
			
			System.out.print("Enter password: ");
			pass = sc.nextLine();
			System.out.println("-------------------------------");
			
			
			if(user.equals("emp") && pass.equals("emp")) {
				conditionCheck = true;
				System.out.println("Succesful Loggin");
				Employee.empMenu();
			}else {
				conditionCheck = false;
				System.out.println("Incorrect user name or password please try again");
				System.out.println("-------------------------------------------------");
				
			}
		
		}while(conditionCheck == false);
		
	}
}
