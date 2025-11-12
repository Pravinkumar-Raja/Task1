package com.example.task;

import java.util.*;
import java.util.stream.Stream;

public class ArraysStreamDemo {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,9,5,7,3);
		Stream<Integer> s=l.stream();
		s.forEach(m->System.out.println(m));
		s.forEach(m->System.out.println(m));
		
	}

}
