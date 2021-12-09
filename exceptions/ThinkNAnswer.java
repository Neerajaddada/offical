package com.technoelevate.exceptions;

public class ThinkNAnswer {

	public static void main(String[] args) {
		System.out.println("Ashwini");
		System.out.println("Hi");
		double c = div(3, 0);
		System.out.println(c);
	}

	private static double div(int i, int j) {
		try {
			System.out.println("hi");
			return i / j;

		} catch (ArithmeticException e) {
			System.out.println("bye");
			return 0;
		} finally {
			System.out.println("neeraj");
		}
	}
}
