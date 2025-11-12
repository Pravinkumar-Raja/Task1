package com.example.task;

import java.util.*;
import java.util.function.Consumer;

class MyObject implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
public class ArraysDemo {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,7,4,9);
		
		//lambda
		l.forEach(m->{System.out.println("Data "+m);});
		//Consumer Method
		l.forEach(new MyObject());
		//Anonymous object
		Consumer<Integer> c=new Consumer<Integer>()
				{
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

				};
				l.forEach(c);
		
	}

}
