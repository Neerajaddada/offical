package com.technoelevate.functionalinterface;

public interface Anshu {

	public void display();

	default void test() {
		System.out.println("Hi Humans!");
	}

	default void job(int a, int b) {
		System.out.println(a + b);
	}

}
