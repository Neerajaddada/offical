package com.technoelevate.multithreading;

public class MyOwnMainThread {

	public static void main(String[] args) {
		System.out.println("Main Thread is running");

		Server1 s1 = new Server1();
		s1.start();

		Server2 s2 = new Server2();
		Thread t = new Thread(s2);
		t.start();

		new Thread() {
			@Override
			public void run() {
				int a = 0;
				while (a < 5) {
					System.out.println(
							"Thread name is " + Thread.currentThread().getName() + " running for " + a + "th time.");
					a++;
				}
			}

		}.start();

		Thread t1 = new Thread(new Server2() {

			@Override
			public void run() {
				int a = 0;
				while (a < 5) {
					try {
//						Thread.sleep(7000);
						s1.join(7000);
						System.out.println("Finally " + Thread.currentThread().getName() + " is executing");
					} catch (InterruptedException i) {
						System.out.println("Thread name is " + Server1.currentThread().getName() + " running for " + a
								+ "th time.");
					}
					a++;

				}
			}

		});
		t1.start();
	}
}
