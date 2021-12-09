package com.technoelevate.arrays;

import java.util.Scanner;

public class StringSorting {
	static String temp;
	static int min;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("First enter number of names to write");
		System.out.println("Then enter those number of names");
		String[] a = new String[s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.next();
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);

		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {

				if (a[j].compareToIgnoreCase(a[min]) < 0) {
					min = j;

				}

			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;

			System.out.println(a[i]);
		}

	}
}
