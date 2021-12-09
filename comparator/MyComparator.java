package com.technoelevate.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Combox1> {

	@Override
	public int compare(Combox1 o1, Combox1 o2) {

		return o1.getOwner().compareTo(o2.getOwner());
	}

//	@Override
//	public int compare(Combox1 c1, Combox1 c2) {
//		if (c1.getPens() > c2.getPens()) {
//			return -1;
//		} else if (c1.getPens() < c2.getPens()) {
//			return +1;
//		} else
//			return 0;
//
//	}

}
