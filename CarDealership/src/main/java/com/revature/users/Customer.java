package com.revature.users;



import java.util.Scanner;


import com.revature.driver.Driver;
import com.revature.util.CarMethods;
import com.revature.util.ConnFactory;
import com.revature.util.LogThis;

public class Customer {
	public static ConnFactory cf= ConnFactory.getInstance();
	static Scanner op = new Scanner(System.in);
	static int choice;
	
	public static void customerMenu() {
		
		
		do {
		System.out.println("---------------");
		System.out.println("CUSTOMER MENU");
		System.out.println("---------------");
		System.out.println("[1] Consult car list");
		System.out.println("------------------");
		System.out.println("[2] Make an offer for a vehicle");
		System.out.println("------------------------------");
		System.out.println("[3] Make Payments");
		System.out.println("---------------------------");
		System.out.println("[4] View My Payments");
		System.out.println("------------------------");
		System.out.println("[5] View my cars");
		System.out.println("-----------------");
		System.out.println("[6] Go back to Main Menu");
		System.out.println("------------------------");
		choice = op.nextInt();
		
		
		switch(choice) {
		case 1:
			CarMethods.consult();
		break;
		
		case 2:
			CarMethods.offerPrice();
		break;
		
		case 3:
			CarMethods.managePayment();
			//CarMethods.getMyPayments();
		break;
			
		case 4:
			CarMethods.getMyPayments();
			
		break;
			
		case 5:
			CarMethods.getMyCars();
		break;
			
		case 6:
			Driver.main(null);
		break;

		}
		}while (choice !=6);

		
	}

}
