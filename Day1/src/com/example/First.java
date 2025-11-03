package com.example;
import java.util.Scanner;
public class First {
	
	public void add()//Instance method
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of a+b="+c);
	}
	
	public void str1() {
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Welcome "+name);
		}
		
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Day1");
		First f=new First();
		f.add();
		f.str1();
			}
	
}
