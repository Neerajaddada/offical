package com.technoelevate.collections;

import java.util.Iterator;

public class ArrayListImplimentationUsingIteratorMain {

	public static void main(String[] args) {
		ArrayListImplimentationUsingIterator all = new ArrayListImplimentationUsingIterator(5);
		all.add("Neeraj");
		all.add("Prabhas");
		all.add("Nagarjuna");
		all.add("Balaiah");
		all.size();
		all.add("Sathish");
		all.add("Ravi");

		all.size();
		all.oneElement(3);
		all.view();

		Iterator it = all.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
