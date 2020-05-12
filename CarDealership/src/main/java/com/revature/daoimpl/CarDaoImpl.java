package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Cars;
import com.revature.beans.Customer;
import com.revature.beans.Offers;
import com.revature.beans.Payments;
import com.revature.dao.CarDAO;
import com.revature.util.ConnFactory;

public class CarDaoImpl implements CarDAO {
		public static ConnFactory cf= ConnFactory.getInstance();
		static int userId;
		static int carId;
		static int offerNum;
		static float offerPrice;
		static Scanner s = new Scanner(System.in);
		
		//INSERT CAR DATA METHOD
		public void insertCar(int carId, String carBrand, float carMileage, int carModelYear, float carPrice, String is_bought) throws SQLException {
			Connection conn= cf.getConnection();
			Statement stmt = conn.createStatement();
			String sql= "INSERT INTO CAR VALUES("+carId+",'"+carBrand+"',"+carMileage+","+carModelYear+","+carPrice+",'"+is_bought+"')";
			stmt.executeUpdate(sql);
		}
		
		//DELETE DATA METHOD
		public void deleteCar(int carId, String carBrand, float carMileage, int carModelYear, float carPrice, String is_bought) throws SQLException {
			System.out.println("Insert ID of the car you wish to delete: ");
			carId = s.nextInt();
			Connection conn= cf.getConnection();
			Statement stmt = conn.createStatement();
			String sql= "DELETE FROM CAR WHERE (car_id="+carId+")";
			stmt.executeUpdate(sql);
		}
		
		//READ CAR TABLE
		public List<Cars> getCarList() throws SQLException {
				List <Cars> carList = new ArrayList <Cars>();
				Connection conn= cf.getConnection();
				
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM CAR");
				Cars s =null;
				while(rs.next()) {
					s = new Cars(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getFloat(5), rs.getString(6));
					carList.add(s);
				}
				return carList;
			}
		
		
		//Read Offers
		public List<Offers> getOffersList() throws SQLException {
			List <Offers> offersList = new ArrayList <Offers>();
			Connection conn= cf.getConnection();
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM OFFERS");
			Offers s =null;
			while(rs.next()) {
				s = new Offers(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getFloat(5), rs.getString(6));
				offersList.add(s);
			}
			return offersList;
		}
		
		//offer approval method
		
				public void manageOffer(int offerId, String customerName, int carId, float carPrice, float carPrice_Offer, String offerStatus) throws SQLException {
					//offerStatus ="approved";
					System.out.println("Enter ID of the offer you wish to alter: ");
					offerId = s.nextInt();
					System.out.println("APPROVE / DENY: ");
					offerStatus = s.next();
					Connection conn= cf.getConnection();
					Statement stmt = conn.createStatement();
				 
					String sql="UPDATE OFFERS SET OFFER_STATUS='"+offerStatus+"' WHERE  (OFFER_ID="+offerId+")";	
					
					//String sql1="UPDATE CAR SET CAR_IS_BOUGHT='Y' WHEN  (OFFER_ID='approved') WHERE  (CAR_ID="+offerId+")";
					stmt.executeUpdate(sql);
					
					
				}
				
				//offer table method
				
				public void makeOffer(int offerId, String customerName, int carId, float carPrice, float carPrice_Offer, String offerStatus) throws SQLException {
					offerStatus ="pending";
					System.out.println("Enter ID of the car you wish to make an offer: ");
					carId = s.nextInt();
					System.out.println("Enter the Price offer for the vehicle");
					carPrice_Offer = s.nextFloat();
					Connection conn= cf.getConnection();
					Statement stmt = conn.createStatement();
				
					String sql="INSERT INTO OFFERS (CUSTOMER_ID, CAR_ID, CAR_PRICE, CAR_PRICE_OFFER, OFFER_STATUS) SELECT  CUSTOMER_ID, CAR_ID, CAR_PRICE, ("+carPrice_Offer+"), ('"+offerStatus+"') FROM CUSTOMER, CAR WHERE (CAR_ID ="+carId+" )"; 
						
					stmt.executeUpdate(sql);
					
					
				}
				
				//payments method
				
				public void managePayment(int paymentId, int carId, int customerid, float carPrice, float carPaymentAmmount, float carPaymentBalance) throws SQLException {
					//offerStatus ="approved";
					System.out.println("Enter ID of the car you wish to pay: ");
					carId = s.nextInt();
					System.out.println("Enter the ammount of your payment: ");
					carPaymentAmmount = s.nextFloat();
					Connection conn= cf.getConnection();
					Statement stmt = conn.createStatement();
				 
					String sql="INSERT INTO PAYMENTS (CAR_ID, CUSTOMER_ID, CAR_PRICE, CAR_PAYMENT, CAR_BALANCE) SELECT ("+carId+"), CUSTOMER_ID, CAR_PRICE, ("+carPaymentAmmount+"), (CAR_PRICE - "+carPaymentAmmount+") FROM CUSTOMER, CAR WHERE (CAR_ID ="+carId+" )";
					stmt.executeUpdate(sql);
					
					
				}
				
				//READ Payments
				public List<Payments> getPayments() throws SQLException {
						List <Payments> paymentList = new ArrayList <Payments>();
						Connection conn= cf.getConnection();
						
						Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery("SELECT * FROM PAYMENTS");
						Payments s =null;
						while(rs.next()) {
							s = new Payments(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getFloat(5), rs.getFloat(6));
							paymentList.add(s);
						}
						return paymentList;
					}
				
				//READ My Payments
				public List<Payments> getMyPayments() throws SQLException {
						List <Payments> paymentList = new ArrayList <Payments>();
						System.out.println("Insert car ID");
						int carId = s.nextInt();
						Connection conn= cf.getConnection();
						
						Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery("SELECT * FROM PAYMENTS WHERE (CAR_ID="+carId+")");
						Payments s =null;
						while(rs.next()) {
							s = new Payments(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getFloat(5), rs.getFloat(6));
							paymentList.add(s);
						}
						return paymentList;
					}
				
				//READ My Cars
				public List<Payments> getMyCars() throws SQLException {
						List <Payments> customerPayment = new ArrayList <Payments>();
						System.out.println("Insert user ID");
						userId = s.nextInt();
						Connection conn= cf.getConnection();
						
						Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery("SELECT * FROM PAYMENTS, CAR WHERE (CUSTOMER_ID="+userId+")");
						Payments s =null;
						while(rs.next()) {
							s = new Payments(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getFloat(5), rs.getFloat(6));
							customerPayment.add(s);
						}
						return customerPayment;
					}




}
