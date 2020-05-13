package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.revature.beans.Cars;
import com.revature.beans.Offers;
import com.revature.beans.Payments;
import com.revature.daoimpl.CarDaoImpl;
import com.revature.driver.Driver;
import com.revature.users.Customer;

class DataTest {

	@Test
	void getCarTest() {
		CarDaoImpl test = new CarDaoImpl();
		try {
			List<Cars> result = test.getCarList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void getOffersTest() {
		CarDaoImpl test = new CarDaoImpl();
			try {
				List<Offers> result = test.getOffersList();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	@Test
	void getPaymentsTest() {
		CarDaoImpl test = new CarDaoImpl();
			try {
				List<Payments> result = test.getPayments();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	

}
