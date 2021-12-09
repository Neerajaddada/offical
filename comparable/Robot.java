package com.technoelevate.comparable;

public class Robot implements Comparable<Robot> {

	private String Name;
	private int chips;
	private int processingSpeed;

	public Robot(String name, int chips, int processingSpeed) {
		this.Name = name;
		this.chips = chips;
		this.processingSpeed = processingSpeed;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getChips() {
		return chips;
	}

	public void setChips(int chips) {
		this.chips = chips;
	}

	public int getProcessingSpeed() {
		return processingSpeed;
	}

	public void setProcessingSpeed(int processingSpeed) {
		this.processingSpeed = processingSpeed;
	}

	@Override
	public int compareTo(Robot r) {

		if (chips == r.chips) {

			return 0;
		} else if (chips > r.chips) {
			return -1;
		} else {
			return +1;
		}

	}

}
