package com.technoelevate.composition;

public class Display {

	private String company;
	private int brightness;
	private Resolution resolution;

	public Display(String company, int brightness, Resolution resolution) {
		this.company = company;
		this.brightness = brightness;
		this.resolution = resolution;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

}
