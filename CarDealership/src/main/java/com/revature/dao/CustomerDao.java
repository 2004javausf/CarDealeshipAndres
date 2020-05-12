package com.revature.dao;

import java.sql.SQLException;

public interface CustomerDao {
	
	public void createCustomer(int customerId, String userName, String password) throws SQLException;

}
