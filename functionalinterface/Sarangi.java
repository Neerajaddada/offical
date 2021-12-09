package com.technoelevate.functionalinterface;

public interface Sarangi {

	default void test() {
		System.out.println("Hello World!");
	}

	default void job(int a) {
		System.out.println(++a);
	}

}
