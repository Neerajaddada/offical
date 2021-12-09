package com.technoelevate.functionalinterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ComparatorUsingLambdaExpression {

	public static void main(String[] args) {
		LinkedList<Customer> ll = new LinkedList();
		ll.add(new Customer("Neeraj", 12345434));
		ll.add(new Customer("Sachin", 92345434));
		ll.add(new Customer("Sameer", 52345434));
		ll.add(new Customer("Shiva", 32345434));

		Collections.sort(ll, (Comparator<Customer>) (Customer c1, Customer c2) -> {
			if (c1.getPhoneNumber() > c2.getPhoneNumber()) {
				return +1;
			} else if (c1.getPhoneNumber() < c2.getPhoneNumber()) {
				return -1;
			} else
				return 0;
		});

		for (Customer c : ll) {
			System.out.println(c + " ");
		}
	}

}
