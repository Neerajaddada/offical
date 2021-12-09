package com.technoelevate.composition;

public class Battery {
	private int power;
	private String company;

	public Battery(int power, String company) {

		this.power = power;
		this.company = company;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
