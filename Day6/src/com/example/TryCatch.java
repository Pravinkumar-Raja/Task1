package com.example;

import java.util.Scanner;

public class TryCatch {
	public static int arr[]=new int[5];
	
	public static void main(String[] args) {
		arr[0]=22;
		arr[1]=33;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=s.nextInt();
		System.out.println("Enter y value");
		int y=s.nextInt();
		try {
			System.out.println("Welcome to Division Program");
			System.out.println("Division of "+x+" / "+y+" is "+(x/y));
			arr[11]=77;
		}
		catch(Exception e)
		{
			
			System.err.println(e.getMessage());
		}
		System.out.println("Bye.......");
	}
}
