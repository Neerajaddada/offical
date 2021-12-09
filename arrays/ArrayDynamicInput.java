package com.technoelevate.arrays;

import java.util.Scanner;

public class ArrayDynamicInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter limit of numbers and numbers");
		int[] b = new int[s.nextInt()];
		for (int i = 0; i < b.length; i++) {
			b[i] = s.nextInt();
		}
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}
}
