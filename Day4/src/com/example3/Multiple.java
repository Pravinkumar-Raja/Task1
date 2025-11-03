package com.example3;
class Number{
	int x=22;
	int y=34;
	int z=55;
	
	Number()
	{
		System.out.println("this is constructor");
	}
	
	void add()
	{
		System.out.println("Addition: "+(x+y+z));
	}
	
	void sub()
	{
		System.out.println("Subtraction: "+(x+z-y));
	}
	
	void div()
	{
		System.out.println("Division: "+(x+z/y));
	}
			
}
public class Multiple extends Number{

	int x=20;
	int y=60;
	int z=2;
	Multiple()
	{
		System.out.println("This is child class constructor");
	}
	void mul()
	{
		System.out.println("Multiplication: "+(x*y*z));
		System.out.println("Multiplication: "+(super.x*super.y*super.z));
	}
	public static void main(String[] args) {
//		Multiple m=new Number(); error occur
//		Number m=new Multiple(); only call the method in super class
//		Number m=(Number)new Multiple(); same as before // up casting
//		Multiple m=(Multiple)new Number();//throws exception //Down casting
		Multiple m=new Multiple();
		m.add();
		m.sub();
		m.div();
		m.mul();
	}

}
