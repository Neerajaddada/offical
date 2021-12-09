package com.technoelevate.exceptions;

public class CustomExceptionMain {

	public static void main(String[] args) {
		CustomException ce = new CustomException("Neeraj", 5664);
		ce.enter("Neeraj", 5664);
		ce.deposit("Neeraj", 5664);
		ce.withdraw("Neeraja", 5664);
	}

}
