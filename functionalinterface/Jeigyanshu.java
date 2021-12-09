package com.technoelevate.functionalinterface;

public class Jeigyanshu implements Anshu, Sarangi {

//	@Override
//	public void test() {
//		Anshu.super.test();
//	}
	@Override
	public void test() {
		Sarangi.super.test();
	}

	@Override
	public void display() {
		System.out.println("Bye");
	}

}
