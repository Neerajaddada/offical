package com.technoelevate.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayListUsingIterator {
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

		Iterator<Customer> itr = hotel.iterator();
		while (itr.hasNext()) {
			Customer x = (Customer) itr.next();
			System.out.println(x.getName());
			System.out.println(x.getPlace());
			System.out.println(x.getPhoneNumber());

		}
	}

}
