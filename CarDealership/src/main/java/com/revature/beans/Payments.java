package com.revature.beans;

public class Payments {
	
	private int paymentId;
	private int carId;
	private int customerid;
	private float carPrice;
	private float carPaymentAmmount;
	private float carPaymentBalance;
	public Payments(int paymentId, int carId, int customerid, float carPrice, float carPaymentAmmount,
			float carPaymentBalance) {
		super();
		this.paymentId = paymentId;
		this.carId = carId;
		this.customerid = customerid;
		this.carPrice = carPrice;
		this.carPaymentAmmount = carPaymentAmmount;
		this.carPaymentBalance = carPaymentBalance;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public float getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	public float getCarPaymentAmmount() {
		return carPaymentAmmount;
	}
	public void setCarPaymentAmmount(float carPaymentAmmount) {
		this.carPaymentAmmount = carPaymentAmmount;
	}
	public float getCarPaymentBalance() {
		return carPaymentBalance;
	}
	public void setCarPaymentBalance(float carPaymentBalance) {
		this.carPaymentBalance = carPaymentBalance;
	}
	@Override
	public String toString() {
		return "Payments [paymentId=" + paymentId + ", carId=" + carId + ", customerid=" + customerid + ", carPrice="
				+ carPrice + ", carPaymentAmmount=" + carPaymentAmmount + ", carPaymentBalance=" + carPaymentBalance
				+ "]";
	}
	
	
	
	
	
}
