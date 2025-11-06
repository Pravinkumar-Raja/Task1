package com.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
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
		
		HashMap<Integer, String> hmg=new HashMap<Integer,String>();
		hmg.put(3, "Mango");
		hmg.put(5, "Grape");
		hmg.put(4, "Apple");
		hmg.put(3, "Orange");
		hmg.put(2, "Apple");
		hmg.put(1, "Banana");
		Set<Integer> s=hmg.keySet();
		for(int x:s)
		{
			System.out.println(x);
		}
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		s.forEach(x->{System.out.println(x);});
		
//		Collection c=hmg.values();
//		for(String str:c)
//		{
//			System.out.println(str);
//		}
		
		for(Map.Entry<Integer,String> m:hmg.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
