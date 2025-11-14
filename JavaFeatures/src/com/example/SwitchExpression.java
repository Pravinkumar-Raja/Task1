package com.example;

import java.util.Scanner;

public class SwitchExpression {
	
	public static String meet(String day)
	{
		switch(day)
		{
		case "Monday" : return "Day1 Meeting";
		case "Tuesday" : return "Day2 Meeting";
		case "Wednesday" : return "Day3 Meeting";
		}
		return day;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		String day=s.next();
		System.out.println(SwitchExpression.meet(day));
		
		// ->
		String result=switch(day)
		{
		case "Monday" -> "Day1 Meeting";
		case "Tuesday"-> "Day2 Meeting";
		case "Wednesday" -> "Day3 Meeting";
		default ->
			throw new IllegalArgumentException("Unexpected value: " + day);
		};
		System.out.println(result);
		
		// :
		String result2="";
		System.out.println("Enter the day");
		String day1=s.next();
				result2=switch(day1)
				{
				case "Monday" : yield result2="Day1 Meeting";
				case "Tuesday" : yield result2="Day2 Meeting";
				case "Wednesday" : yield result2="Day3 Meeting";
				default :
					throw new IllegalArgumentException("Unexpected value: " + day1);
				};
			
				System.out.println(result2);
		
	}

}
