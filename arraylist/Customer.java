package com.technoelevate.arraylist;

public class Customer {
	private String name;
	private String place;
	private long phoneNumber;

	public Customer(String name, String place, long phoneNumber) {
		this.name = name;
		this.place = place;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
