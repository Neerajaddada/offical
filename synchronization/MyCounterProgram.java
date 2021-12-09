package com.technoelevate.synchronization;

public class MyCounterProgram {
	public static void main(String[] args) {
		CountDown cd = new CountDown();
		Counter c = new Counter(cd);
		Thread t1 = new Thread(c);
		t1.setName("Thread 1");

		Thread t2 = new Thread(c);
		t2.setName("Thread 2");

		t1.start();
		t2.start();
	}
}

class CountDown {
	String color;

	public synchronized void doCountDown() {
		switch (Thread.currentThread().getName()) {
		case "Thread 1":
			this.color = "Pink";
			break;
		case "Thread 2":
			this.color = "Purpul";
			break;
		case "Thread 3":
			this.color = "Orenge";
			break;
		default:
			this.color = "White";

		}
		for (int i = 1; i <= 10; i++)

			System.out.println("Name of the thread is " + Thread.currentThread().getName() + " colour of the thread is"
					+ color + " at i: " + i);

	}
}

class Counter implements Runnable {
	CountDown countDown;

	public Counter(CountDown countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {
		countDown.doCountDown();
	}

}
