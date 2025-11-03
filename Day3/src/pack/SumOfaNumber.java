package pack;

import java.util.Scanner;

public class SumOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		//prime in if
		if(n>1)
		{
		if(n%2==0 || n%3==0)
		{
			System.out.println("The number is not a prime number");
		}
		else
		{
			System.out.println("It is a prime number");
		}
	}
		//prime in for
		for(int i=2;i<n;i++)
		{
			if(i%2!=0 && i%3!=0)
			{
				System.out.println("The number "+i+" is prime");
			}
		}
		//wrong

	}

}
