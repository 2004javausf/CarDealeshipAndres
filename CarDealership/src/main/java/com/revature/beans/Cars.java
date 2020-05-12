package com.revature.beans;


public class Cars  {


	
	private int carId;
	private String carBrand;
	private float carMileage;
	private int carModelYear;
	private float carPrice;
	private String is_bought;
	
	public Cars(int carId, String carBrand, float carMileage, int carModelYear, float carPrice, String is_bought) {
		this.carId=carId;
		this.carBrand=carBrand;
		this.carMileage=carMileage;
		this.carModelYear=carModelYear;
		this.carPrice=carPrice;
		this.is_bought=is_bought;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public float getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(float carMileage) {
		this.carMileage = carMileage;
	}

	public int getCarModelYear() {
		return carModelYear;
	}

	public void setCarModelYear(int carModelYear) {
		this.carModelYear = carModelYear;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}

	public String getIs_bought() {
		return is_bought;
	}

	public void setIs_bought(String is_bought) {
		this.is_bought = is_bought;
	}

	@Override
	public String toString() {
		return "\nCar Id: " + carId + "\nBrand: " + carBrand + "\nMileage: " + carMileage + "\nYear: "
				+ carModelYear + "\nPrice: " + carPrice + "\n";
				//"\nHas the car been purchased?: " + is_bought + "\n";
	}
	
	

	
	
}
