package com.technoelevate.composition;

public class Camera {
	private int cameraCount;
	private String company;
	private Pixel pixel;

	public Camera(int cameraCount, String company, Pixel pixel) {

		this.cameraCount = cameraCount;
		this.company = company;
		this.pixel = pixel;
	}

	public int getCameraCount() {
		return cameraCount;
	}

	public void setCameraCount(int cameraCount) {
		this.cameraCount = cameraCount;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Pixel getPixel() {
		return pixel;
	}

	public void setPixel(Pixel pixel) {
		this.pixel = pixel;
	}

}
