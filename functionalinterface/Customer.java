package com.technoelevate.functionalinterface;

public class Customer {

	private String Name;
	private int phoneNumber;

	public Customer(String name, int phoneNumber) {
		this.Name = name;
		this.phoneNumber = phoneNumber;
	}

	protected String getName() {
		return Name;
	}

	protected int getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer Name is " + Name + " and his/her phone number is " + phoneNumber;
	}

}
