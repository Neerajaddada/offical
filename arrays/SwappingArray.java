package com.technoelevate.arrays;

import java.util.Scanner;

public class SwappingArray {
	static int temp, min;

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any ten numbers");

		int[] a = new int[s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		display(a);
		print(a);
	}

	static void display(int[] a) {

		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] < a[j]) {
					min = j;
				}

			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
