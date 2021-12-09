package com.technoelevate.variable;

public class VariableTypes {
	private static int a;
	public int b;

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	public static void main(String[] args) {
		VariableTypes vt = new VariableTypes();
		a = 10;
		vt.b = 20;
		System.out.println(vt.add());
		System.out.println(vt.sub());

	}

}
