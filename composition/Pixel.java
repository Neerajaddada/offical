package com.technoelevate.composition;

public class Pixel {

	private int length;
	private int width;

	public Pixel(int length, int width) {

		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
