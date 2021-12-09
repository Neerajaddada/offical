package com.technoelevate.multithreading;

public class Server1 extends Thread {

	public void display() {
		System.out.println("Hii User!");
	}

	@Override
	public void run() {
		int a = 0;
		try {
			Thread.sleep(5000);
			System.out.println("Refreshed after a sleep,good to go!");
		} catch (InterruptedException i) {
			System.out.println("It takes a while");
		}
		while (a < 5) {
			System.out
					.println("Thread name is " + Server1.currentThread().getName() + " running for " + a + "th time.");
			a++;
		}
	}

}
