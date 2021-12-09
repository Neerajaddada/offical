package com.technoelevate.multithreading;

public class NewThread {

	public static void main(String[] args) {
		System.out.println("Main Thread");

		FirstThread ft = new FirstThread();
		ft.start();

		ft.display();

		SecoundThread st = new SecoundThread();
		Thread t = new Thread(st);
		t.start();

		new Thread() {

			@Override
			public void run() {
				Thread.currentThread().setName("Annonamas Thread");
				System.out
						.println("Name of Thread is " + Thread.currentThread().getName() + ",it is good name right. ");
			}

		};

		Thread t1 = new Thread(new SecoundThread() {

			@Override
			public void run() {
				try {
					ft.join(5000);
//					Thread.sleep(5000);

					System.out.println("New Thread starting now");
				} catch (InterruptedException i) {
					System.out.println("No waiting i will start");

				}

			}

		});
		t1.start();

	}

}
