package com.example;

import java.util.Scanner;

public class FinallyDemo {
	
	public static int arr[]=new int[5];
	
	
	public static void div(int x,int y)
	{
		try {
			System.out.println("Division of "+x+" / "+y+" is "+(x/y));
		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		finally {
			
		System.out.println("Closing the resource");	
		FinallyDemo.disp();
		}		
	}
	
	public static void disp()
	{
		System.out.println("The division is performed successfully");
	}
	public static void main(String[] args) {
		arr[0]=22;
		arr[1]=33;

		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Division Program");
		System.out.println("Enter x value");
		int x=s.nextInt();
		System.out.println("Enter y value");
		int y=s.nextInt();
		
		FinallyDemo.div(x,y);
		System.out.println("Bye.......");
	}
}


