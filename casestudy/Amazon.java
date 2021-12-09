package com.technoelevate.casestudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList list = new ArrayList();

	public static void add() {

		System.out.println("Enter the size");
		int n = scanner.nextInt();
		System.out.println("Enter the Product Name");
		for (int i = 0; i < n; i++) {
			list.add(scanner.next());
		}
		System.out.println("*****Adding is Done******");
	}

	public static void view() {

		System.out.println(list);
		System.out.println("*****View is Done******");

	}

	public static void remove() {
		System.out.println("Enter the value to be remove");
		String str = scanner.next();
		list.remove(str);
		System.out.println(list);
		System.out.println("*****Remove is Done*******");
	}

	public static void modify() {
		System.out.println("Enter the old item ");
		String old = scanner.next();
		System.out.println("Enter the new item ");
		String str = scanner.next();
		if (str != old) {
			list.remove(old);
			list.add(str);

		}
		System.out.println("*****Modify is Done*******");

	}

//	public static void exit() {
//		System.exit(0);
//	}

	public static void menu() {

		System.out.println("Enter Your Choices");
		System.out.println("Enter 1 to add");
		System.out.println("Enter 2 to view");
		System.out.println("Enter 3 to remove");
		System.out.println("Enter 4 to modify");

	}

}
