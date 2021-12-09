package com.technoelevate.encapsulation;

public class PanCard {

	private String name;
	private int phoneNumber;
	private int sscHallTicketNumber;
	private String panNumber;
	private String fatherNumber;

	public String getName() {
		return name;
	}

	public PanCard(String name, int phoneNumber, int sscHallTicketNumber, String panNumber, String fatherNumber) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.sscHallTicketNumber = sscHallTicketNumber;
		this.panNumber = panNumber;
		this.fatherNumber = fatherNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSscHallTicketNumber() {
		return sscHallTicketNumber;
	}

	public void setSscHallTicketNumber(int sscHallTicketNumber) {
		this.sscHallTicketNumber = sscHallTicketNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public String getFatherNumber() {
		return fatherNumber;
	}

}
