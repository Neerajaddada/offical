package com.technoelevate.arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] a = { 12, 1, 12, 13, 1 };
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
			System.out.println(a[i]);
		}

	}

}
