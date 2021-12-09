package com.technoelevate.composition;

public class Moblie {
	public static void main(String[] args) {
		Battery b = new Battery(5000, "Sandisk");
		Camera c = new Camera(4, "samsung", new Pixel(1080, 320));
		Display d = new Display("Iphone", 400, new Resolution(2000, 420));
		System.out.println(d.getCompany());
		System.out.println(d.getBrightness());
		System.out.println(d.getResolution().getLenght());
		System.out.println(d.getResolution().getWidth());
		System.out.println(c.getCameraCount());
		System.out.println(c.getCompany());
		System.out.println(c.getPixel().getLength());
		System.out.println(c.getPixel().getWidth());
		System.out.println(b.getCompany());
		System.out.println(b.getPower());
	}

}
