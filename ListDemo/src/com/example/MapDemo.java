package com.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap hm =new HashMap();
		hm.put(3, "Mango");
		hm.put('x', 56.34f);
		hm.put("A", 55);
		hm.put(3, "Apple");
		hm.put("", 31);
		System.out.println(hm.get('x'));
		System.out.println(hm.remove(3));
		System.out.println(hm);
		
		LinkedHashMap l=new LinkedHashMap();
		l.put(3, "Mango");
		l.put('x', 56.34f);
		l.put("A", 55);
		l.put(3, "Apple");
		l.put("", 31);
		System.out.println(l);
		System.out.println(l.containsKey('x'));
		
		TreeMap t=new TreeMap();
		t.put(3, "Mango");
		t.put(4, "Apple");
		t.put(2, "Orange");
		t.put(3, "Apple");
		t.put(1, "Banana");
		
		System.out.println(t);
		System.out.println(t.containsKey(3));
	}

}
