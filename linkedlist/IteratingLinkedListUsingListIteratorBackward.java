package com.technoelevate.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingLinkedListUsingListIteratorBackward {

	private static LinkedList l = new LinkedList();

	public static void main(String[] args) {
		MobilePhone mp1 = new MobilePhone("OPPO", 17000.00, "Mixed colour");
		MobilePhone mp2 = new MobilePhone("Micromax", 13000.00, "Plastic black");
		MobilePhone mp3 = new MobilePhone("Infinix", 21000.00, "olivie green");

		l.add(mp1);
		l.add(mp2);
		l.add(mp3);

		getPhones();
	}

	private static void getPhones() {
		ListIterator list = l.listIterator(l.size());
		while (list.hasPrevious()) {
			MobilePhone mp = (MobilePhone) list.previous();
			System.out.println("Mobile name is " + mp.getMobileBrand() + " price is " + mp.getCost() + " colour of "
					+ mp.getColour());

		}

	}

}
