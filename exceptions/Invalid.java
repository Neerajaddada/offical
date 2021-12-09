package com.technoelevate.exceptions;

public class Invalid extends RuntimeException {

	public Invalid(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		return "Your not a valid person to access this account";
	}

}
