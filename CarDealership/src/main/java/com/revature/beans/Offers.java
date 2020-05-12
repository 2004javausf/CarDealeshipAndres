package com.revature.beans;

public class Offers {
	
	private int offerId;
	private String customerName;
	private int carId;
	private float carPrice;
	private float carPrice_Offer;
	private String offerStatus;
	
	public Offers(int offerId, String customerName, int carId, float carPrice, float carPrice_Offer,
			String offerStatus) {
		super();
		this.offerId = offerId;
		this.customerName = customerName;
		this.carId = carId;
		this.carPrice = carPrice;
		this.carPrice_Offer = carPrice_Offer;
		this.offerStatus = offerStatus;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}

	public float getCarPrice_Offer() {
		return carPrice_Offer;
	}

	public void setCarPrice_Offer(float carPrice_Offer) {
		this.carPrice_Offer = carPrice_Offer;
	}

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}

	@Override
	public String toString() {
		return "Offers [Offer Id: " + offerId + ", Customer Id: " + customerName + ", Car Id: " + carId + ", Car Price: "
				+ carPrice + ", Car Offer Price: " + carPrice_Offer + ", Offer Status: " + offerStatus + "]";
	}
	
	

}
