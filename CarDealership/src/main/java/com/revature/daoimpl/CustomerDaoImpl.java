package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.beans.Payments;
import com.revature.dao.CustomerDao;
import com.revature.util.ConnFactory;

public class CustomerDaoImpl implements CustomerDao {
	public static ConnFactory cf= ConnFactory.getInstance();

	public void createCustomer(int customerId, String customerName, String customerPassword) throws SQLException{
		//prepared statement:precompiled-compiled in Java / statement in SQL
		/*Connection conn= cf.getConnection();
		String sql="INSERT INTO CUSTOMER VALUES ("+customerId+",'"+userName+"','"+password+"')";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(userName, password);
		ps.executeUpdate();*/
		//INSERT CAR DATA METHOD
		Connection conn= cf.getConnection();
		Statement stmt = conn.createStatement();
		String sql="INSERT INTO CUSTOMER VALUES ("+customerId+",'"+customerName+"','"+customerPassword+"')";
		stmt.executeUpdate(sql);
		}
	
	
	//READ My Customers
	public List<Customer> getCustomer(int customerId, String customerName, String customerPassword) throws SQLException {
			List <Customer> customer = new ArrayList <Customer>();
			
			Connection conn= cf.getConnection();
			
			Statement stmt = conn.createStatement();
			System.out.println("Your customer information is");
			ResultSet rs = stmt.executeQuery("SELECT CUSTOMER_ID, CUSTOMER_NAME, CUSTOMER_LAST_NAME FROM CUSTOMER WHERE (CUSTOMER_NAME='"+customerName+"') AND (CUSTOMER_LAST_NAME='"+customerPassword+"')");
			Customer s =null;
			while(rs.next()) {
				s = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
				customer.add(s);
			}
			return customer;
		}
}


