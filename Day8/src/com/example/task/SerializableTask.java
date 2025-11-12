package com.example.task;

import java.io.*;

public class SerializableTask {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeBean eb=new EmployeeBean(101,"Vishwa",35000);
		FileOutputStream fos=new FileOutputStream("D:\\Program-UST\\Demo.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(eb);
		
		FileInputStream fis =new FileInputStream("D:\\Program-UST\\Demo.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		EmployeeBean e=(EmployeeBean)ois.readObject();
		System.out.println(e);
	}
	

}
