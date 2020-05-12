package com.revature.util;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CarDaoImpl;

public class CarMethods {
	
	static CarDaoImpl sdi = new CarDaoImpl();
	static Scanner sc = new Scanner(System.in);
	static int id;
	static String brand;
	static String userName;
	static float mil;
	static float price;
	static int year;
	static float offerPrice;
	static String isBought;
	
	
	public static void consult () {
	
		try {
			System.out.println(sdi.getCarList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void offerPrice () {
		
		try {
			sdi.makeOffer(id, userName, id, price, offerPrice, isBought);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void consultOffer () {
		
		try {
			System.out.println(sdi.getOffersList());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getPayments () {
			
			try {
				System.out.println(sdi.getPayments());
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public static void getMyPayments () {
		
		try {
			System.out.println(sdi.getMyPayments());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getMyCars () {
		
		try {
			System.out.println(sdi.getMyCars());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void approvedOffer () {
			
			try {
				sdi.manageOffer(id, userName, id, price, offerPrice, isBought);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	public static void managePayment () {
		
		try {
			sdi.managePayment(id, id, id, price, price, price);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insert () {
		
		System.out.println("Insert car brand: ");
		brand = sc.next();
		
		System.out.println("Insert car Mileage: ");
		mil = sc.nextInt();
		
		System.out.println("Insert car Price: ");
		price = sc.nextInt();
		
		System.out.println("Insert car Year: ");
		year = sc.nextInt();
		
		System.out.println("Is this car purchased?");
		System.out.println("[N] NO");
		System.out.println("[Y] YES");
		isBought = sc.next();
		try {
			sdi.insertCar(id, brand, mil, year, price, isBought);
			//sdi.insertCar(1, "Nissan", 75000, 12500, 2011 , 5);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("A new Vehicle has been added to the data base");
	}
	
	public static void delete () {	
		
		try {
			sdi.deleteCar(id, brand, mil, year, price, isBought);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Vehicle has been deleted from the data base");
	}

}