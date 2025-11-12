package com.example.com.byteOriented;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOriented {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("D:\\Program-UST\\B.txt");
		String str="Welcome to UST HealthProof";
		byte b[]=str.getBytes();
		String st="You are Assigned to a Project";
		byte b1[]=st.getBytes();
		fos.write(b);
		fos.write(b1);
		System.out.println("Message written successfully");
		
		FileInputStream fis=new FileInputStream("D:\\Program-UST\\B.txt");
		int i=0;
//		System.out.println(fis.read());
//		while((i=fis.read())!=-1)
//		{
//			System.out.print(i);
//		}
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Message Readed Successfully");
	}

}
