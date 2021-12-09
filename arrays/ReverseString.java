package com.technoelevate.arrays;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number and write same number of names ");
		String[] a = new String[(s.nextInt())];

		for (int i = 0; i < a.length; i++) {
			a[i] = s.next();
		}
		for (int i = 0; i < a.length; i++) {
			String b = a[i];
			String c = "";
			for (int j = 0; j < b.length(); j++) {
				c = b.charAt(j) + c;

			}
			a[i] = c;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
