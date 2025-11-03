package com.example;


import java.util.Scanner;


public class Ex1 {

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter your name");

	String name=sc.nextLine();

	System.out.println("Hai "+name+" Welcome to UST Global");
	
	//Integer Program
	
	System.out.println("Enter a number");

	int a=sc.nextInt();

	System.out.println("Enter another number");

	int b=sc.nextInt();

	System.out.println("The addition of "+a+" and "+b+" is "+(a+b));

}

}

