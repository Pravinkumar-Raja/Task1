package com.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeandDateDemo {
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.isLeapYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.minusDays(10));
		
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
	}

}
