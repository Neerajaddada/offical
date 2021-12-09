package com.technoelevate.multithreading;

public class FirstThread extends Thread {

	public void display() {
		System.out.println("Just displaying things");
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Refreshed now!");
		} catch (InterruptedException i) {
			System.out.println("i am working now");
		}

		System.out.println("First Thread");

	}

}
