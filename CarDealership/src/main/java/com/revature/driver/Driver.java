package com.revature.driver;


import java.util.Scanner;


import com.revature.users.LogInCustomer;
import com.revature.users.LogInEmployee;




public class Driver {
	
	public static void main(String[] args) {
		
		
		
		LogInCustomer input = new LogInCustomer();
		
		LogInEmployee input2 = new LogInEmployee();
		
		Scanner scan = new Scanner(System.in);
		int op;
		
		do {
		System.out.println("-----------");
		System.out.println("MAIN MENU");
		System.out.println("-----------");
		System.out.println("[1] Customer");
		System.out.println("------------");
		System.out.println("[2] Employee");
		System.out.println("------------");
		op = scan.nextInt();
		
		switch(op) {
		case 1:
			input.LogInMethod();
		break;
		case 2:
			input2.LogInMethod();
		break;
		}
		}while(op != 1 && op != 2);
		
		

	}

}
