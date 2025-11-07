package com.example;

import java.io.DataInputStream;
import java.io.IOException;

public class InheritThrows {
	public static void main(String[] args) {
		ThrowsDemo.div(22, 2);
		DataInputStream d=new DataInputStream(System.in);
		String name="";
		System.out.println("Enter the name");
		try {
			name=d.readLine();
			System.out.println(Integer.parseInt(name));
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		System.out.println("Hi "+name);
		}
	}

}
