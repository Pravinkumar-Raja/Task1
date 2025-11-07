package com.example;

import java.util.Scanner;

public class UserDefined {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("Valid Age");
		}
		else
		{
//			try {
//				throw new InvalidAgeException(age);
//			}
//			catch (InvalidAgeException e)
//			{
//				e.printStackTrace();
//			}
			
//			try {
//				throw new InvalidAgeException(age);
//			}
//			catch (Exception e)
//			{
//				e.printStackTrace();
//			}
			
			try {
				throw new Exception("Invalid Age"+age);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
