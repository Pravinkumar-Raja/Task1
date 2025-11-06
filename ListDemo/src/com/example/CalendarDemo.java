package com.example;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.DATE)+" /"+(c.get(Calendar.MONTH)+1)+" /"+c.get(Calendar.YEAR));
	}

}
