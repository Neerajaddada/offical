package com.technoelevate.millennials;

import java.util.Scanner;

public class Millennials {

	private static int age;
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age = s.nextInt();
		if (age > 99) {
			System.out.println("Your the senior most person");
		} else if (age > 93) {
			System.out.println("Your a WW II");
		} else if (age > 75) {
			System.out.println("Your a Post War");
		} else if (age > 66) {
			System.out.println("Your a Boomers I");
		} else if (age > 56) {
			System.out.println("Your a Boomers II");
		} else if (age > 40) {
			System.out.println("Your a Gen X");
		} else if (age > 24) {
			System.out.println("Your a Millennial");
		} else if (age > 8) {
			System.out.println("Your a Gen Z");
		} else if (age >= 0) {
			System.out.println("Your a newbie");
		}

	}

}
