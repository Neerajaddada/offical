package com.technoelevate.casestudy;

public class GroceryItemList {
	private Object[] cart;
	private int position = 0;

	public GroceryItemList(int size) {
		this.cart = new Object[size];
	}

	public void addItem(Object item) {
		if (this.position >= this.size()) {
			grow();
		}
		this.cart[position] = item;
		position++;

	}

	public int size() {
		return this.cart.length;
	}

	public Object[] grow() {
		Object[] plate = this.cart;
		this.cart = new Object[this.size() * 2];
		for (int i = 0; i < plate.length; i++) {
			this.cart[i] = plate[i];
		}

		return this.cart;
	}

	public Object getItem(int number) {

		return this.cart[number];
	}

	public void getAllItems() {
		for (Object bag : cart) {
			System.out.println(bag + ": ");

		}
	}

}
