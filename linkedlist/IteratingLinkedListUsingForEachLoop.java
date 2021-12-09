package com.technoelevate.linkedlist;

import java.util.LinkedList;

public class IteratingLinkedListUsingForEachLoop {

	private static LinkedList<MobilePhone> ll = new LinkedList();

	public static void main(String[] args) {
		MobilePhone mp1 = new MobilePhone("Realme", 21999.00, "Blue");
		MobilePhone mp2 = new MobilePhone("Oneplus", 25999.00, "Silver");
		MobilePhone mp3 = new MobilePhone("Redmi", 19999.00, "Black");

		ll.add(mp1);
		ll.add(mp2);
		ll.add(mp3);

		getDetails();
	}

	private static void getDetails() {
		for (MobilePhone mp : ll) {
			System.out.println("Phone brand is" + mp.getMobileBrand() + " and it's price is" + mp.getCost()
					+ ",price is" + mp.getColour());

		}

	}
}
