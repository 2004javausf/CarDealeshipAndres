package com.revature.dao;


import java.sql.SQLException;

import java.util.List;

import com.revature.beans.Cars;



	//step 2 create interface , then create your table in SQL
	//with the same parameters as your bean
public interface CarDAO {
	
		//DAO
		//Data Access Object
		//Modularity and loose coupling
		//want to make sure that the only thing interacting with DB is DAOImpl
		//DAO is an open interface w/ multiple implementations
		
		//DAO methods usually deal with CRUD ops!!
		//Create 
		public void insertCar (int carId, String carBrand, float carMileage, int carModelYear, float carPrice, String is_bought) throws SQLException;
		//delete
		public void deleteCar (int carId, String carBrand, float carMileage, int carModelYear, float carPrice, String is_bought) throws SQLException;
		
		//read
		public List<Cars> getCarList() throws SQLException;
		
		
	
}