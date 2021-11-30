package com.technoelevate.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingLinkedListUsingIterator {

	private static LinkedList<MobilePhone> lmp = new LinkedList();

	public static void main(String[] args) {
		MobilePhone mp1 = new MobilePhone("IQOO", 40999.00, "RoyalBlue");
		MobilePhone mp2 = new MobilePhone("Mi", 92999.00, "Mirror Black");
		MobilePhone mp3 = new MobilePhone("Asus Rog", 79999.00, "red");

		lmp.add(mp1);
		lmp.add(mp2);
		lmp.add(mp3);

		getDetails();
	}

	private static void getDetails() {
		Iterator itr = lmp.iterator();
		while (itr.hasNext()) {
			MobilePhone mp = (MobilePhone) itr.next();
			System.out.println("My gaming phone is " + mp.getMobileBrand() + " it's price is " + mp.getCost()
					+ " colour of " + mp.getColour());
		}
	}

}
