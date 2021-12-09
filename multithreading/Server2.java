package com.technoelevate.multithreading;

public class Server2 implements Runnable {

	@Override
	public void run() {
		int a = 0;

		while (a < 5) {
			System.out.println("Thread name is Server2 running for " + a + "th time.");
			a++;

		}
	}

}
