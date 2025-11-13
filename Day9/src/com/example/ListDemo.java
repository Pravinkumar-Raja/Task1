package com.example;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void print(int n)
	{
		System.out.println(n);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		Arrays.stream(a).forEach(ListDemo::print);//static method reference
		Arrays.stream(a).forEach(m->{System.out.println(m);});//lambda 
		System.out.println();
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);//method reference
		l.forEach(System.out::println);
	}



}
