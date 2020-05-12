package com.revature.beans;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerPassword;
	
	public Customer(int customerId, String customerName, String customerPassword) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLastName() {
		return customerPassword;
	}

	public void setCustomerLastName(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerId=" + customerName + ", customerPassword="
				+ customerPassword + "]";
	}
	
	
	

}
