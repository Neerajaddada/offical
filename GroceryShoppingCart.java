package com.technoelevate.casestudy;

public class GroceryShoppingCart {

	public static void main(String[] args) {
		GroceryItemList list = new GroceryItemList(2);
		list.addItem("Shampoo");
		list.addItem("Lays");
		list.addItem("Biscute");
		list.addItem("Choclate");
		list.addItem("Markers");
		System.out.println(list.size());
		list.addItem("Book");
		list.addItem("College Bag");
		list.addItem("Bottle");
		list.addItem("Mobilephone");
		list.addItem("Earphones");
		list.addItem("DryFruits");
		list.addItem("Fresh Bread");
		System.out.println(list.size());

		System.out.println(list.getItem(1));
		list.getAllItems();
	}
}
