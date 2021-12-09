package com.technoelevate.timeanddate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeAndDate {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();

		System.out.println(lt);

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.of(date, time);

		System.out.println(ldt);

		Month m = ldt.getMonth();
		int day = ldt.getDayOfMonth();
		System.out.println("Month: " + m + " Day: " + day);
	}

}
