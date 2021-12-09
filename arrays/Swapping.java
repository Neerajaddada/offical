package com.technoelevate.arrays;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a + "  " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + "  " + b);

	}

}
