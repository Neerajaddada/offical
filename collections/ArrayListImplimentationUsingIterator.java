package com.technoelevate.collections;

import java.util.Iterator;

public class ArrayListImplimentationUsingIterator implements Iterable {

	private Object[] a;
	private int position;

	public ArrayListImplimentationUsingIterator(int size) {
		this.a = new Object[size];
	}

	public void add(Object arr) {
		if (position >= a.length) {
			grow();
		}
		this.a[position] = arr;
		position++;
	}

	private Object grow() {
		Object[] t = this.a;
		this.a = new Object[(a.length) * 3];
		for (int i = 0; i < t.length; i++) {
			this.a[i] = t[i];
		}
		return this.a;
	}

	@Override
	public Iterator iterator() {
		return new Jar();
	}

	public void view() {
		for (Object list : this.a) {
			System.out.println(list + " ");

		}
	}

	public void oneElement(int index) {
		System.out.println(a[index]);
	}

	public void size() {
		System.out.println(this.a.length);
	}

	private class Jar implements Iterator {
		int t;

		@Override
		public boolean hasNext() {
			if (t < position) {
				return true;
			} else
				return false;
		}

		@Override
		public Object next() {
			return a[t++];

		}

	}

}
