package com.example;

sealed class A permits B,C{
	public void name()
	{
		System.out.println("Default Name A");
	}
}
non-sealed class B extends A{
	public void name()
	{
		System.out.println("Default Name B");
	}
}
final class C extends A{
	public void name()
	{
		System.out.println("Default Name C");
	}
	
}
public class SealedClass{
	public static void main(String[] args) {
		C c=new C();
		c.name();
	}
}
