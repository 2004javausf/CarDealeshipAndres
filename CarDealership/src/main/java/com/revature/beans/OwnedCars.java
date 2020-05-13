package com.revature.beans;

public class OwnedCars {
	
	private int carId;
	private int userId;
	private String carBrand;
	private int carModelYear;
	
	public OwnedCars(int carId, int userId, String carBrand, int carModelYear) {
		super();
		this.carId = carId;
		this.userId = userId;
		this.carBrand = carBrand;
		this.carModelYear = carModelYear;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getCarModelYear() {
		return carModelYear;
	}

	public void setCarModelYear(int carModelYear) {
		this.carModelYear = carModelYear;
	}

	@Override
	public String toString() {
		return "OwnedCars [carId=" + carId + ", userId=" + userId + ", carBrand=" + carBrand + ", carModelYear="
				+ carModelYear + "]";
	}
	
	

}
