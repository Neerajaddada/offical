package com.technoelevate.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingLinkedListUsingListIteratorForward {

	private static LinkedList<MobilePhone> llmp = new LinkedList();

	public static void main(String[] args) {
		MobilePhone mp1 = new MobilePhone("Samsung J7", 22000.00, "brown");
		MobilePhone mp2 = new MobilePhone("Samsung pro", 52000.00, "cronic black");
		MobilePhone mp3 = new MobilePhone("Samsung Ultra", 72000.00, "iceblue");
		llmp.add(mp1);
		llmp.add(mp2);
		llmp.add(mp3);

		getSamsungDetails();
	}

	private static void getSamsungDetails() {
		ListIterator<MobilePhone> list = llmp.listIterator();
		while (list.hasNext()) {
			MobilePhone mp = (MobilePhone) list.next();

			System.out.println("Best mobile is " + mp.getMobileBrand() + " at price point of " + mp.getCost()
					+ " comes in " + mp.getColour() + " colour");
		}
	}

}
