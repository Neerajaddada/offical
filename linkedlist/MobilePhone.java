package com.technoelevate.linkedlist;

public class MobilePhone {
	private String mobileBrand;
	private double cost;
	private String colour;

	public MobilePhone(String mobileBrand, double cost, String colour) {
		this.mobileBrand = mobileBrand;
		this.cost = cost;
		this.colour = colour;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
