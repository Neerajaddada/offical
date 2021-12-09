package com.technoelevate.collections;

public class MyArrayListMain {
	public static void main(String[] args) {

		MyArrayList list = new MyArrayList(2);
		System.out.println(list.size());
		list.addElement("Neeraj");
		list.addElement("Sachin");
		list.addElement("Dharni");
		System.out.println(list.size());
		list.addElement("Dharni");
		list.addElement("Dharni");
		list.addElement("Dharni");
		list.addElement("Dharni");
		list.addElement("Dharni");
		System.out.println(list.size());

		System.out.println(list.getElement(1));
		list.getAllElements();

	}
}
