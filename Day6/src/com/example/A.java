package com.example;

class B{
	
}
public class A extends B{
	public static void main(String[] args) {
		B b=new A();
		System.out.println(b instanceof A);
	}

}
