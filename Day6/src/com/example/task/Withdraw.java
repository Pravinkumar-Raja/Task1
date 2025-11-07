package com.example.task;

import java.util.Scanner;

public class Withdraw {
	public static void main(String[] args) {
		int amount;
		int balance=25000;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount to Withdraw");
		amount=s.nextInt();
		if(amount<0)
		{
			try {
			throw new NegativeAmountException(amount);
			}
			catch (NegativeAmountException e)
			{
				e.printStackTrace();
			}
		}
		else if(amount>balance)
		{
			try {
				throw new InsufficientAccountBalance(amount);
			}
			catch (InsufficientAccountBalance e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Withdraw successful");
			System.out.println("Amount Withdrawn : "+amount);
		}
	}

}
