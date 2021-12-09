package com.technoelevate.treelist;

import java.util.Set;
import java.util.TreeSet;

public class BasicTreeSet {

	private static Set<String> ts = new TreeSet();

	public static void main(String[] args) {

		// Colours c1 = new Colours(1, 2, 2, 4, 5, 6);
//		Colours c2 = new Colours(6, 7, 8, 9, 9, 11);
//		Colours c3 = new Colours(11, 12, 13, 13, 15, 16);
//		Colours c4 = new Colours(16, 17, 17, 19, 20, 21);

//		ts.add(c1);
//		ts.add(c2);
//		ts.add(c3);
//		ts.add(c4);
//
//		// getSorted();
//		display();

		String[] a = new String[3];
		a[0] = "Neeraj";
		a[1] = "Sachin";
		a[2] = "Application";

		ts.add(a[0]);
		ts.add(a[1]);
		ts.add(a[2]);

		display();
	}

	private static void display() {
		System.out.println(ts);
	}

	private static void getSorted() {

	}

}
