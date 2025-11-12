package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String s=sdf.format(d);
		Date d1=sdf.parse(str);
		System.out.println(s);
		System.out.println(d1);
		System.out.println(d1.getDate()+" /"+(d1.getMonth()+1)+" /"+(d1.getYear()+1900));
	}

}
