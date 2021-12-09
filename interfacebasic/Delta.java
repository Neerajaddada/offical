package com.technoelevate.interfacebasic;

public class Delta extends Box implements Alpha, Rays {

	int a = 50;
	int b = 60;

	@Override
	public int addition() {

		return 30;
	}

	@Override
	public int substraction() {

		return a - b;
	}

	@Override
	public int multiplication() {
		return 0;
	}

}
