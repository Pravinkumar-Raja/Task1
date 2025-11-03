package com.example3;

import java.util.Scanner;

public class Task2 {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String arr[]=new String[n];
	
	
	void add()
	{
	
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		
		
	}
	void delete(int x)
	{
		for(int i=0;i<n;i++)
		{
			if(i==x)
			{
				n=arr.length-1;

			}
			
		}
		System.out.println(arr.length);
		
	}
	void update(String name,int y)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==arr[y])
			{
				arr[i]=name;
			}
		}
	}
	void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Task2 t=new Task2();
		t.add();
		t.delete(4);
		t.update("Book",2);
		t.display();
		
	}

}
