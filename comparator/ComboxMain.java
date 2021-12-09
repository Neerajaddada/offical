package com.technoelevate.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComboxMain {

	private static ArrayList<Combox1> ac = new ArrayList();

	public static void main(String[] args) {
		Combox1 c1 = new Combox1("Neeraj", 5, 3, 2);
		Combox1 c2 = new Combox1("Srinivas", 1, 2, 3);
		Combox1 c3 = new Combox1("Charan", 5, 5, 5);
		Combox1 c4 = new Combox1("Nagamani", 3, 2, 2);

		ac.add(c1);
		ac.add(c2);
		ac.add(c3);
		ac.add(c4);

		MyComparator c = new MyComparator();
		Collections.sort(ac, c);

		for (Combox1 c5 : ac) {
			System.out.println(c5.getOwner() + " " + c5.getPens() + " " + c5.getPencils() + " " + c5.getErasers());
		}

	}
}
