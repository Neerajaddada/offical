package com.technoelevate.functionalinterface;

public class RunnableUsingLambdaExpression {

	public static void main(String[] args) {
//		Runnable r = () -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Runnable Thread");
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//	}

//	@Override
//	public String toString() {
//		return "RunnableUsingLambdaExpression []";
//	}
		new Thread(() -> {
			for (int i = 5; i > 0; i--) {
				System.out.println(" Anonnamas Thread");
			}
		}).start();

	}
}
