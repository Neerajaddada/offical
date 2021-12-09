package com.technoelevate.set;

import java.util.HashMap;
import java.util.Map;

public class Location1 {

	private final int loacationId;
	private final String description;
	private final Map<String, Integer> exits;

	public Location1(int loacationId, String description) {
		this.loacationId = loacationId;
		this.description = description;
		this.exits = new HashMap<String, Integer>();
	}

	public void addExits(String direction, int location) {
		exits.put(direction, location);
	}

	public int getLoacationId() {
		return loacationId;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}

}