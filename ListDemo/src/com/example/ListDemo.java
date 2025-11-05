package com.example;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Mango");
		a.add("orange");
		a.add("Grape");
		a.add(45);
		a.remove(0);
		a.remove("Grape");
		a.add(0,"Apple");
		
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedList a1=new LinkedList();
		a1.add("Apple");
		a1.add("Apple");
		a1.add(34);
		a1.add(56.44f);
		a1.add('s');
		a1.push("Orange");
		a1.remove(0);
		a1.remove("Apple");
		
		for(Object o: a1)
		{
			System.out.println(o);
		}
		
		Vector a2=new Vector();
		a2.add("Apple");
		a2.add("Apple");
		a2.add(77);
		a2.add('h');
		
		a2.forEach(x->{System.out.println(x);});
		
		Stack a3=new Stack();
		a3.add("Mango");
		a3.add(44);
		a3.add("Apple");
		a3.add('y');
		a3.push("Orange");
		
		a3.forEach(System.out::println);
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Orange");
		
		for(String s: al)
		{
			System.out.println(s);
		}
	}
	

	

}
