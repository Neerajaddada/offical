package com.technoelevate.functionalinterface;

public class LambdaExpressionExperiment implements Anshu {

	public static void main(String[] args) {
		Anshu a = () -> {
			System.out.println("Neeraj");
		};
		a.display();
		a1.display();

	}

	static Anshu a1 = new LambdaExpressionExperiment();

	@Override
	public void display() {
		System.out.println("Addada");
	}

}
