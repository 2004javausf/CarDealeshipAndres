package com.revature.users;



import java.util.Scanner;

import com.revature.daoimpl.CarDaoImpl;
import com.revature.driver.Driver;
import com.revature.util.CarMethods;

public class Employee {
	
	public static void empMenu() {
		
		Scanner op = new Scanner(System.in);
		int choice;
		
		do {
		System.out.println("---------------");
		System.out.println("EMPLOYEE MENU");
		System.out.println("---------------");
		System.out.println("[1] Consult car list");
		System.out.println("-------------------");
		System.out.println("[2] Add a car to the Lot");
		System.out.println("-----------------------");
		System.out.println("[3] Remove a car from the Lot");
		System.out.println("-----------------------------");
		System.out.println("[4] View Customer Offers");
		System.out.println("----------------------");
		System.out.println("[5] Approve or Deny Offers");
		System.out.println("-------------------------------");
		System.out.println("[6] View Payments");
		System.out.println("-------------------------------");
		System.out.println("[7] Go back to Main Menu");
		System.out.println("------------------------");
		choice = op.nextInt();
		
		switch(choice) {
		case 1:
			
			CarMethods.consult();
		break;
	
		case 2:
			CarMethods.insert();
		break;
		
		case 3:
			CarMethods.delete();
		break;
		
		case 4:
			CarMethods.consultOffer();
		break;
		
		case 5:
			CarMethods.approvedOffer();
			
		break;
		
		case 6:
			CarMethods.getPayments();
		break;
		
		case 7:
			Driver.main(null);
		break;
		}
		}while(choice != 7);
	}

}
