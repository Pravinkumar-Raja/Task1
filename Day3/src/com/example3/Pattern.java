package com.example3;

public class Pattern {
	public static void main(String[] args) {
		//right triangle and its reverse
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)//right triangle = j=1;j<=i;j++;
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		//Square pattern
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//square 2
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//square 3
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//triangle pattern
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j%2==1)
				{
				System.out.print("* ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
