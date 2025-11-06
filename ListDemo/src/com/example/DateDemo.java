package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		String str="22/05/2025";
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String s=sdf.format(d);
		Date d1=sdf.parse(str);
		System.out.println(s);
		System.out.println(d1);
		System.out.println(d1.getDate()+" /"+(d1.getMonth()+1)+" /"+(d1.getYear()+1900));
	}

}
