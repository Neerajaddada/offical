package com.technoelevate.encapsulation;

public class PanCardMain {
	public static void main(String[] args) {
		PanCard pc = new PanCard("Neeraj", 32543746, 423648734, "vd5346w77dsfsd", "srinivas");
		System.out.println(pc.getName());
		System.out.println(pc.getPhoneNumber());
		System.out.println(pc.getSscHallTicketNumber());
		System.out.println(pc.getPanNumber());
		System.out.println(pc.getFatherNumber());
	}

}
