package com.technoelevate.arraylist;

import java.util.ArrayList;

public class IteratingArrayListUsingForLoop {
	private static ArrayList<Customer> hotel = new ArrayList<Customer>();

	public static void main(String[] args) {
		Customer c = new Customer("Neeraj", "Hydrabad", 334545566);
		Customer c1 = new Customer("Addada", "Kodad", 32343553);
		Customer c2 = new Customer("Srinivas", "Kodad", 34454665);
		Customer c3 = new Customer("Nagamani", "Kodad", 652545566);
		Customer c4 = new Customer("Charan", "Nijambad", 324545566);
		hotel.add(c);
		hotel.add(c1);
		hotel.add(c2);
		hotel.add(c3);
		hotel.add(c4);

		getCustomer();

	}

	public static void getCustomer() {

		for (int i = 0; i < hotel.size(); i++) {

			System.out.println(hotel.get(i).getName());
			System.out.println(hotel.get(i).getPlace());
			System.out.println(hotel.get(i).getPhoneNumber());
		}
	}

}
