package com.technoelevate.exceptions;

import java.util.Scanner;

public class CustomException {

	private String name;
	private double balance;
	private String userName;
	private int pin;

	public CustomException(String userName, int pin) {
		this.userName = userName;
		this.pin = pin;
	}

	public void enter(String userName, int pin) {

		if (this.userName.equals(userName) && this.pin == pin) {
			System.out.println("Welcome! Dear Customer");
		} else {
			System.out.println("Go away");
			throw new Invalid("Invalid");
		}
	}

	public void withdraw(String userName, int pin) {

		if (this.userName.equals(userName) && this.pin == pin) {
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter money");
			double amount = s.nextDouble();
			if (balance > amount) {
				this.balance -= amount;
				if (this.balance < 200) {
					System.out.println("Sucessfully money withdrawn,remaining balance is: " + balance
							+ ". Maintain minimum balance!");

				} else
					System.out.println("Sucessfully money withdrawn,remaining balance is: " + balance);

			} else
				System.out.println("Insufficient balance");

		} else {
			System.out.println("Go away");
			throw new Invalid("Invalid");
		}
	}

	public void deposit(String userName, int pin) {

		if (this.userName.equals(userName) && this.pin == pin) {
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter money");
			double amount = s.nextDouble();

			this.balance += amount;
			System.out.println("Your sucessfully add money and your balance is: " + balance);
		} else {
			System.out.println("Go away");
			throw new Invalid("Invalid");
		}
	}

	public String getUserName() {
		return userName;
	}

	public int getPin() {
		return pin;
	}

}
