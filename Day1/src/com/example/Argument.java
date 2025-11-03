package com.example;

public class Argument {
	public int add(int x,int y)
	{
		int a=x;
		int b=y;
		return a+b;
	}
	
	public static int square(int x)
	{
		return x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Argument A=new Argument();
		int result=A.add(78,77);
		System.out.println("The result of addition is "+result);
		int result2=Argument.square(99);
		System.out.println("The square of the number is "+result2);
		// Square of the args[] array 
		System.out.println(Integer.parseInt(args[2])*Integer.parseInt(args[2]));

	}

}
