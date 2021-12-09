package com.technoelevate.treelist;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeListSorting {

	private static TreeSet<Colours> ts = new TreeSet();

	public static void main(String[] args) {
		Colours c1 = new Colours(21, 34, 54, 65, 67, 98);
		Colours c2 = new Colours(21, 34, 35, 36, 36, 38);
		Colours c3 = new Colours(4, 5, 6, 7, 8, 9);
		Colours c4 = new Colours(0, 1, 1, 2, 2, 3);

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);

	}

	private static void getNumberOfColours() {
		Iterator<Colours> it = ts.iterator();
		while (it.hasNext()) {
			Colours c = (Colours) it.next();

		}
	}

}
