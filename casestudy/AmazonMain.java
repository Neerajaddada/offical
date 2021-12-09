package com.technoelevate.casestudy;

import java.util.Scanner;

public class AmazonMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Amazon.menu();

		boolean num = true;
		while (num) {
			System.out.println("Enter your choice ");
			int i = scanner.nextInt();
			switch (i) {
			case 1:
				Amazon.add();
				Amazon.menu();
				break;
			case 2:
				Amazon.view();
				Amazon.menu();
				break;
			case 3:
				Amazon.remove();
				Amazon.menu();
				break;
			case 4:
				Amazon.modify();
				break;
			default:
				System.out.println("Please choice number form above");
				int j = scanner.nextInt();
				if (j > 0 && j < 4) {
					i = j;
				} else {
					System.out.println("Exit");
				}
			}
		}
	}
}
