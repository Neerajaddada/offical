package com.technoelevate.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class RobotMain {
	private static ArrayList<Robot> ar = new ArrayList();

	public static void main(String[] args) {
		Robot r = new Robot("Ravi", 4, 256);
		Robot r1 = new Robot("Ramu", 8, 128);
		Robot r2 = new Robot("Rajesh", 2, 512);

		ar.add(r);
		ar.add(r1);
		ar.add(r2);

		Collections.sort(ar);

		for (Robot r3 : ar) {
			System.out.println(r3.getName() + " " + r3.getChips() + " " + r3.getProcessingSpeed());
		}
	}

}
