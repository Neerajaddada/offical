package com.technoelevate.arraylist;

import java.util.ArrayList;

public class IteratingArrayListUsingForEachLoop {
	private static ArrayList<Customer> cu = new ArrayList<Customer>();

	public static void main(String[] args) {
		Customer c = new Customer("Neeraj", "Hydrabad", 3254);
		Customer c1 = new Customer("Sachine", "Hydrabad", 3254);
		Customer c2 = new Customer("Shiva", "Hydrabad", 3254);
		Customer c3 = new Customer("Surya", "Hydrabad", 3254);
		Customer c4 = new Customer("Prudhvi", "Hydrabad", 3254);

		cu.add(c);
		cu.add(c1);
		cu.add(c2);
		cu.add(c3);
		cu.add(c4);

		getCustomer();

	}

	public static void getCustomer() {
		for (Customer s : cu) {
			System.out.println(s.getPhoneNumber());
			System.out.println(s.getName());
			System.out.println(s.getPlace());

		}

	}

}
