package com.technoelevate.linkedlist;

import java.util.LinkedList;

public class IteratingLinkedListUsingForLoop {

	private static LinkedList<MobilePhone> l = new LinkedList();

	public static void main(String[] args) {
		MobilePhone mp1 = new MobilePhone("Iphone", 75000.00, "Gray");
		MobilePhone mp2 = new MobilePhone("Nokia", 1500.00, "SkyBlue");
		MobilePhone mp3 = new MobilePhone("Vivo", 25000.00, "White");

		l.add(mp3);
		l.add(mp2);
		l.add(mp1);

		getdetails();
	}

	private static void getdetails() {
		for (int i = 0; i < l.size(); i++) {

			System.out.println("My phone is " + l.get(i).getMobileBrand() + " price of " + l.get(i).getCost()
					+ " colour is " + l.get(i).getColour());
		}

	}

}
