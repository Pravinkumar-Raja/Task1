package com.example3;

import java.util.Scanner;

public class Cat {
public static void main(String[] args) {
//	int marks[]= {1,2,3,4,5};
//	for(int i=0;i<marks.length;i++)
//	{
//		System.out.println(marks[i]);
//	}
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	int avg=0;
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter the number:");
		a[i]=sc.nextInt();
	}
	System.out.println();
	int count=0;
	for(int n:a)
	{
		if(n<40)
		{
			count++;
		}
		sum+=n;
	}
	avg=sum/a.length;
	System.out.println(sum);
	System.out.println(avg);
	System.out.println("Failed in "+count+" subject");

}
}
